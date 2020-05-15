package com.google.android.gms.org.conscrypt;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class OpenSSLBIOSource {
    private OpenSSLBIOInputStream source;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ByteBufferInputStream extends InputStream {
        private final ByteBuffer source;

        public ByteBufferInputStream(ByteBuffer byteBuffer) {
            this.source = byteBuffer;
        }

        public int available() {
            return this.source.limit() - this.source.position();
        }

        public int read() {
            if (this.source.remaining() > 0) {
                return this.source.get();
            }
            return -1;
        }

        public void reset() {
            this.source.reset();
        }

        public long skip(long j) {
            long position = (long) this.source.position();
            this.source.position((int) (j + position));
            return ((long) this.source.position()) - position;
        }

        public int read(byte[] bArr) {
            int position = this.source.position();
            this.source.get(bArr);
            return this.source.position() - position;
        }

        public int read(byte[] bArr, int i, int i2) {
            int min = Math.min(this.source.remaining(), i2);
            int position = this.source.position();
            this.source.get(bArr, i, min);
            return this.source.position() - position;
        }
    }

    private OpenSSLBIOSource(OpenSSLBIOInputStream openSSLBIOInputStream) {
        this.source = openSSLBIOInputStream;
    }

    private synchronized void release() {
        OpenSSLBIOInputStream openSSLBIOInputStream = this.source;
        if (openSSLBIOInputStream != null) {
            NativeCrypto.BIO_free_all(openSSLBIOInputStream.getBioContext());
            this.source = null;
        }
    }

    static OpenSSLBIOSource wrap(ByteBuffer byteBuffer) {
        return new OpenSSLBIOSource(new OpenSSLBIOInputStream(new ByteBufferInputStream(byteBuffer), false));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            release();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public long getContext() {
        return this.source.getBioContext();
    }
}
