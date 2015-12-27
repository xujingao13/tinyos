/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'EasyCollectionMsg'
 * message type.
 */

public class EasyCollectionMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 14;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = -1;

    /** Create a new EasyCollectionMsg of size 14. */
    public EasyCollectionMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new EasyCollectionMsg of the given data_length. */
    public EasyCollectionMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new EasyCollectionMsg with the given data_length
     * and base offset.
     */
    public EasyCollectionMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new EasyCollectionMsg using the given byte array
     * as backing store.
     */
    public EasyCollectionMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new EasyCollectionMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public EasyCollectionMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new EasyCollectionMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public EasyCollectionMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new EasyCollectionMsg embedded in the given message
     * at the given base offset.
     */
    public EasyCollectionMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new EasyCollectionMsg embedded in the given message
     * at the given base offset and length.
     */
    public EasyCollectionMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <EasyCollectionMsg> \n";
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [seq=0x"+Long.toHexString(get_seq())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [TempData=0x"+Long.toHexString(get_TempData())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [HumidityData=0x"+Long.toHexString(get_HumidityData())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [PhotoData=0x"+Long.toHexString(get_PhotoData())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [current_time=0x"+Long.toHexString(get_current_time())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'id'
     */
    public int get_id() {
        return (int)getUIntBEElement(offsetBits_id(), 16);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(int value) {
        setUIntBEElement(offsetBits_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: seq
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'seq' is signed (false).
     */
    public static boolean isSigned_seq() {
        return false;
    }

    /**
     * Return whether the field 'seq' is an array (false).
     */
    public static boolean isArray_seq() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'seq'
     */
    public static int offset_seq() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'seq'
     */
    public static int offsetBits_seq() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'seq'
     */
    public int get_seq() {
        return (int)getUIntBEElement(offsetBits_seq(), 16);
    }

    /**
     * Set the value of the field 'seq'
     */
    public void set_seq(int value) {
        setUIntBEElement(offsetBits_seq(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'seq'
     */
    public static int size_seq() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'seq'
     */
    public static int sizeBits_seq() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: TempData
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'TempData' is signed (false).
     */
    public static boolean isSigned_TempData() {
        return false;
    }

    /**
     * Return whether the field 'TempData' is an array (false).
     */
    public static boolean isArray_TempData() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'TempData'
     */
    public static int offset_TempData() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'TempData'
     */
    public static int offsetBits_TempData() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'TempData'
     */
    public int get_TempData() {
        return (int)getUIntBEElement(offsetBits_TempData(), 16);
    }

    /**
     * Set the value of the field 'TempData'
     */
    public void set_TempData(int value) {
        setUIntBEElement(offsetBits_TempData(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'TempData'
     */
    public static int size_TempData() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'TempData'
     */
    public static int sizeBits_TempData() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: HumidityData
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'HumidityData' is signed (false).
     */
    public static boolean isSigned_HumidityData() {
        return false;
    }

    /**
     * Return whether the field 'HumidityData' is an array (false).
     */
    public static boolean isArray_HumidityData() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'HumidityData'
     */
    public static int offset_HumidityData() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'HumidityData'
     */
    public static int offsetBits_HumidityData() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'HumidityData'
     */
    public int get_HumidityData() {
        return (int)getUIntBEElement(offsetBits_HumidityData(), 16);
    }

    /**
     * Set the value of the field 'HumidityData'
     */
    public void set_HumidityData(int value) {
        setUIntBEElement(offsetBits_HumidityData(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'HumidityData'
     */
    public static int size_HumidityData() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'HumidityData'
     */
    public static int sizeBits_HumidityData() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: PhotoData
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'PhotoData' is signed (false).
     */
    public static boolean isSigned_PhotoData() {
        return false;
    }

    /**
     * Return whether the field 'PhotoData' is an array (false).
     */
    public static boolean isArray_PhotoData() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'PhotoData'
     */
    public static int offset_PhotoData() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'PhotoData'
     */
    public static int offsetBits_PhotoData() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'PhotoData'
     */
    public int get_PhotoData() {
        return (int)getUIntBEElement(offsetBits_PhotoData(), 16);
    }

    /**
     * Set the value of the field 'PhotoData'
     */
    public void set_PhotoData(int value) {
        setUIntBEElement(offsetBits_PhotoData(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'PhotoData'
     */
    public static int size_PhotoData() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'PhotoData'
     */
    public static int sizeBits_PhotoData() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: current_time
    //   Field type: long, unsigned
    //   Offset (bits): 80
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'current_time' is signed (false).
     */
    public static boolean isSigned_current_time() {
        return false;
    }

    /**
     * Return whether the field 'current_time' is an array (false).
     */
    public static boolean isArray_current_time() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'current_time'
     */
    public static int offset_current_time() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'current_time'
     */
    public static int offsetBits_current_time() {
        return 80;
    }

    /**
     * Return the value (as a long) of the field 'current_time'
     */
    public long get_current_time() {
        return (long)getUIntBEElement(offsetBits_current_time(), 32);
    }

    /**
     * Set the value of the field 'current_time'
     */
    public void set_current_time(long value) {
        setUIntBEElement(offsetBits_current_time(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'current_time'
     */
    public static int size_current_time() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'current_time'
     */
    public static int sizeBits_current_time() {
        return 32;
    }

}
