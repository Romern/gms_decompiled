package p000;

import android.app.PendingIntent;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.concurrent.Future;

/* renamed from: mjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mjj implements aqzp {

    /* renamed from: d */
    public static final lvn f33830d = new lvn("SmartDeviceSourceController");

    /* renamed from: e */
    ParcelFileDescriptor[] f33831e;

    /* renamed from: f */
    public OutputStream f33832f;

    /* renamed from: g */
    public ParcelFileDescriptor[] f33833g;

    /* renamed from: h */
    public ParcelFileDescriptor[] f33834h;

    /* renamed from: i */
    public ByteArrayOutputStream f33835i = new ByteArrayOutputStream();

    /* renamed from: j */
    public Future f33836j;

    /* renamed from: k */
    protected final bqgj f33837k;

    /* renamed from: l */
    public final bqgj f33838l;

    /* renamed from: m */
    public final mht f33839m;

    protected mjj(mht mht, bqgj bqgj) {
        this.f33839m = mht;
        this.f33837k = bqgj;
        this.f33838l = snp.m35704b(9);
    }

    /* renamed from: a */
    public void mo20086a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20087b() {
        throw null;
    }

    /* renamed from: c */
    public abstract void mo20088c();

    /* renamed from: a */
    public final void mo20092a(int i, String str) {
        f33830d.mo25418e("SmartDevice internal error: %d, %s", Integer.valueOf(i), str);
        this.f33839m.mo20028a(i, 2, str);
        mo20087b();
    }

    /* renamed from: b */
    public final void mo20094b(int i, String str) {
        this.f33839m.mo20028a(i - 1, 5, str);
        mo20086a();
    }

    /* renamed from: a */
    public final void mo20093a(PendingIntent pendingIntent) {
        f33830d.logVerbose("onShowUi", new Object[0]);
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            f33830d.mo25417e("Intent sending failed", e, new Object[0]);
            mo20094b(3, e.getMessage());
        }
    }
}
