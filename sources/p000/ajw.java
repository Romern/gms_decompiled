package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: ajw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajw extends InputStream implements DataInput {

    /* renamed from: d */
    private static final ByteOrder f688d = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: e */
    private static final ByteOrder f689e = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public ByteOrder f690a;

    /* renamed from: b */
    final int f691b;

    /* renamed from: c */
    int f692c;

    /* renamed from: f */
    private DataInputStream f693f;

    public ajw(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f690a = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f693f = dataInputStream;
        int available = dataInputStream.available();
        this.f691b = available;
        this.f692c = 0;
        this.f693f.mark(available);
        this.f690a = byteOrder;
    }

    /* renamed from: a */
    public final long mo841a() {
        return ((long) readInt()) & 4294967295L;
    }

    public final int available() {
        return this.f693f.available();
    }

    public final int read() {
        this.f692c++;
        return this.f693f.read();
    }

    public final boolean readBoolean() {
        this.f692c++;
        return this.f693f.readBoolean();
    }

    public final byte readByte() {
        int i = this.f692c + 1;
        this.f692c = i;
        if (i <= this.f691b) {
            int read = this.f693f.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f692c += 2;
        return this.f693f.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        int i = this.f692c;
        int length = bArr.length;
        int i2 = i + length;
        this.f692c = i2;
        if (i2 > this.f691b) {
            throw new EOFException();
        } else if (this.f693f.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final int readInt() {
        int i = this.f692c + 4;
        this.f692c = i;
        if (i <= this.f691b) {
            int read = this.f693f.read();
            int read2 = this.f693f.read();
            int read3 = this.f693f.read();
            int read4 = this.f693f.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f690a;
                if (byteOrder == f688d) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f689e) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f690a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readLine() {
        return null;
    }

    public final long readLong() {
        int i = this.f692c + 8;
        this.f692c = i;
        if (i <= this.f691b) {
            int read = this.f693f.read();
            int read2 = this.f693f.read();
            int read3 = this.f693f.read();
            int read4 = this.f693f.read();
            int read5 = this.f693f.read();
            int read6 = this.f693f.read();
            int read7 = this.f693f.read();
            int read8 = this.f693f.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f690a;
                if (byteOrder == f688d) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == f689e) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f690a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i = this.f692c + 2;
        this.f692c = i;
        if (i <= this.f691b) {
            int read = this.f693f.read();
            int read2 = this.f693f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f690a;
                if (byteOrder == f688d) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f689e) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f690a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f692c += 2;
        return this.f693f.readUTF();
    }

    public final int readUnsignedByte() {
        this.f692c++;
        return this.f693f.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        int i = this.f692c + 2;
        this.f692c = i;
        if (i <= this.f691b) {
            int read = this.f693f.read();
            int read2 = this.f693f.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f690a;
                if (byteOrder == f688d) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f689e) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f690a);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i) {
        int min = Math.min(i, this.f691b - this.f692c);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f693f.skipBytes(min - i2);
        }
        this.f692c += i2;
        return i2;
    }

    /* renamed from: a */
    public final void mo842a(long j) {
        long j2 = (long) this.f692c;
        if (j2 > j) {
            this.f692c = 0;
            this.f693f.reset();
            this.f693f.mark(this.f691b);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) != i) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f693f.read(bArr, i, i2);
        this.f692c += read;
        return read;
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.f692c + i2;
        this.f692c = i3;
        if (i3 > this.f691b) {
            throw new EOFException();
        } else if (this.f693f.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public ajw(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
