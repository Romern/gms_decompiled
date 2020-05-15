package p000;

import android.app.PendingIntent;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileDescriptor;

/* renamed from: qbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qbt extends qby implements aaai {

    /* renamed from: a */
    private final aaag f40906a;

    /* renamed from: b */
    private final int f40907b;

    /* renamed from: c */
    private final qbn f40908c;

    public qbt(int i, aaag aaag, qbn qbn) {
        this.f40908c = qbn;
        this.f40906a = aaag;
        this.f40907b = i;
    }

    /* renamed from: a */
    public final void mo23887a() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    /* renamed from: b */
    public final void mo23891b() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    /* renamed from: c */
    public final void mo23893c() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    /* renamed from: d */
    public final void mo23894d() {
        throw new UnsupportedOperationException("Service does not support this.");
    }

    /* renamed from: a */
    public final void mo23888a(qbx qbx) {
        this.f40906a.mo16658a(new qbq(this.f40908c, qbx));
    }

    /* renamed from: b */
    public final void mo23892b(qbx qbx) {
        this.f40906a.mo16658a(new qbr(this.f40907b, this.f40908c, qbx));
    }

    /* renamed from: a */
    public final void mo23889a(qbx qbx, ParcelFileDescriptor parcelFileDescriptor) {
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        if (fileDescriptor == null) {
            Log.e("CMirroringServiceStub", "failed to get file descriptor");
        } else {
            this.f40906a.mo16658a(new qbp(this.f40908c, qbx, fileDescriptor));
        }
    }

    /* renamed from: a */
    public final void mo23890a(qbx qbx, qca qca, String str, PendingIntent pendingIntent) {
        this.f40906a.mo16658a(new qbs(this.f40908c, qbx, qca, str, pendingIntent));
    }
}
