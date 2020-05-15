package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: qxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qxy {

    /* renamed from: a */
    private final ByteBuffer f42406a;

    public qxy(ByteBuffer byteBuffer) {
        this.f42406a = byteBuffer;
    }

    /* renamed from: a */
    public final byte mo24395a(int i) {
        try {
            return this.f42406a.get(i);
        } catch (RuntimeException e) {
            throw new IOException("Exception reading from buffer", e);
        }
    }

    /* renamed from: b */
    public final int mo24400b(int i) {
        try {
            return this.f42406a.getInt(i);
        } catch (RuntimeException e) {
            throw new IOException("Exception reading from buffer", e);
        }
    }

    /* renamed from: c */
    public final long mo24401c(int i) {
        try {
            return this.f42406a.getLong(i);
        } catch (RuntimeException e) {
            throw new IOException("Exception reading from buffer", e);
        }
    }

    /* renamed from: a */
    public final int mo24396a() {
        return this.f42406a.capacity();
    }

    /* renamed from: a */
    public final void mo24397a(int i, byte b) {
        try {
            this.f42406a.put(i, b);
        } catch (RuntimeException e) {
            throw new IOException("Exception writing to buffer", e);
        }
    }

    /* renamed from: a */
    public final void mo24398a(int i, int i2) {
        try {
            this.f42406a.putInt(i, i2);
        } catch (RuntimeException e) {
            throw new IOException("Exception writing to buffer", e);
        }
    }

    /* renamed from: a */
    public final void mo24399a(int i, long j) {
        try {
            this.f42406a.putLong(i, j);
        } catch (RuntimeException e) {
            throw new IOException("Exception writing to buffer", e);
        }
    }
}
