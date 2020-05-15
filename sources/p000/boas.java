package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: boas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boas implements DataInput {

    /* renamed from: a */
    final DataInput f132475a;

    public boas(ByteArrayInputStream byteArrayInputStream) {
        this.f132475a = new DataInputStream(byteArrayInputStream);
    }

    public final boolean readBoolean() {
        try {
            return this.f132475a.readBoolean();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final byte readByte() {
        try {
            return this.f132475a.readByte();
        } catch (EOFException e) {
            throw new IllegalStateException(e);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final char readChar() {
        try {
            return this.f132475a.readChar();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final double readDouble() {
        try {
            return this.f132475a.readDouble();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final float readFloat() {
        try {
            return this.f132475a.readFloat();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int readInt() {
        try {
            return this.f132475a.readInt();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String readLine() {
        try {
            return this.f132475a.readLine();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final long readLong() {
        try {
            return this.f132475a.readLong();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final short readShort() {
        try {
            return this.f132475a.readShort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String readUTF() {
        try {
            return this.f132475a.readUTF();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int readUnsignedByte() {
        try {
            return this.f132475a.readUnsignedByte();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int readUnsignedShort() {
        try {
            return this.f132475a.readUnsignedShort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int skipBytes(int i) {
        try {
            return this.f132475a.skipBytes(i);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void readFully(byte[] bArr) {
        try {
            this.f132475a.readFully(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        try {
            this.f132475a.readFully(bArr, i, i2);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
