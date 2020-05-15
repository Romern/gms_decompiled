package p000;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bobl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobl extends FilterInputStream implements DataInput {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bobl(InputStream inputStream) {
        super(inputStream);
        bmxy.m108581a(inputStream);
    }

    /* renamed from: a */
    private final byte m111045a() {
        int read = this.in.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    public final char readChar() {
        return (char) readUnsignedShort();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        boav.m111017a(this, bArr);
    }

    public final int readInt() {
        byte a = m111045a();
        byte a2 = m111045a();
        return bqcn.m112575a(m111045a(), m111045a(), a2, a);
    }

    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public final long readLong() {
        byte a = m111045a();
        byte a2 = m111045a();
        byte a3 = m111045a();
        byte a4 = m111045a();
        byte a5 = m111045a();
        byte a6 = m111045a();
        return bqcr.m112593a(m111045a(), m111045a(), a6, a5, a4, a3, a2, a);
    }

    public final short readShort() {
        return (short) readUnsignedShort();
    }

    public final String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    public final int readUnsignedByte() {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public final int readUnsignedShort() {
        return bqcn.m112575a((byte) 0, (byte) 0, m111045a(), m111045a());
    }

    public final int skipBytes(int i) {
        return (int) this.in.skip((long) i);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        boav.m111018a(this, bArr, i, i2);
    }
}
