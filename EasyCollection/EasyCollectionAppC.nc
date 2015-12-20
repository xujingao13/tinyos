#include "EasyCollection.h"

configuration EasyCollectionAppC {}
implementation {
	components EasyCollectionC, MainC, LedsC, ActiveMessageC;
	components CollectionC as Collector;
	components new CollectionSenderC(0xee);
	components new TimerMilliC();
	components SerialActiveMessageC;
	components new SerialAMSenderC(AM_EASYCOLLECTIONMSG);

	EasyCollectionC.Packet -> SerialAMSenderC;
	EasyCollectionC.AMPacket -> SerialAMSenderC;
	EasyCollectionC.AMSend -> SerialAMSenderC;
	EasyCollectionC.AMControl -> SerialActiveMessageC;
	EasyCollectionC.Boot -> MainC;
	EasyCollectionC.RadioControl -> ActiveMessageC;
	EasyCollectionC.RoutingControl -> Collector;
	EasyCollectionC.Leds -> LedsC;
	EasyCollectionC.Timer -> TimerMilliC;
	EasyCollectionC.Send -> CollectionSenderC;
	EasyCollectionC.RootControl -> Collector;
	EasyCollectionC.Receive -> Collector.Receive[0xee];
}