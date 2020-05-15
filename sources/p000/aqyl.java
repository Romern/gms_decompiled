package p000;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.io.IOException;

/* renamed from: aqyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aqyl implements arib {

    /* renamed from: c */
    private static final asco f87094c = ascp.m73787a("D2D", aqyl.class.getSimpleName());

    /* renamed from: a */
    public final arib f87095a;

    /* renamed from: b */
    protected ParcelFileDescriptor[] f87096b;

    /* renamed from: d */
    private final Handler f87097d;

    /* renamed from: e */
    private bmxv f87098e = bmvz.f131120a;

    public aqyl(Handler handler, arib arib) {
        bmxy.m108581a(arib);
        this.f87095a = arib;
        bmxy.m108581a(handler);
        this.f87097d = handler;
    }

    /* renamed from: a */
    public final void mo48264a() {
        f87094c.logVerbose("cleanup", new Object[0]);
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f87096b;
        f87094c.mo25412b("safelyClosePipe", new Object[0]);
        if (parcelFileDescriptorArr != null) {
            try {
                for (ParcelFileDescriptor parcelFileDescriptor : parcelFileDescriptorArr) {
                    parcelFileDescriptor.close();
                }
            } catch (IOException e) {
                asco asco = f87094c;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("IOException while closing ParcelFileDescriptor: ");
                sb.append(valueOf);
                asco.mo25416d(sb.toString(), new Object[0]);
            }
        }
        if (this.f87098e.mo66813a()) {
            arae arae = (arae) this.f87098e.mo66814b();
            arae.f87189a.mo25412b("cleanup", new Object[0]);
            arae.m72315a(arae.f87190b);
            arae.m72315a(arae.f87191c);
            return;
        }
        f87094c.mo25416d("readWriteStreamsHandlerOptional is not present.", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo48272b();

    /* renamed from: a */
    public final void mo48265a(int i, String str) {
        f87094c.logVerbose("onError", new Object[0]);
        this.f87097d.post(new aqyk(this, i, str));
    }

    /* renamed from: a */
    public final void mo48266a(PendingIntent pendingIntent) {
        f87094c.logVerbose("onShowUi", new Object[0]);
        this.f87097d.post(new aqyg(this, pendingIntent));
    }

    /* renamed from: a */
    public final void mo48267a(aqzo aqzo) {
        bmxy.m108581a(aqzo);
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
            arae arae = new arae(aqzo, createPipe2[0], createPipe[1]);
            this.f87096b = (ParcelFileDescriptor[]) bmxy.m108581a(new ParcelFileDescriptor[]{createPipe[0], createPipe2[1]});
            this.f87098e = bmxv.m108567c(arae);
            mo48272b();
        } catch (IOException e) {
            f87094c.mo25410a((Throwable) e);
            mo48265a(13, "create pipe failed");
        }
    }

    /* renamed from: a */
    public final void mo48268a(BootstrapCompletionResult bootstrapCompletionResult) {
        f87094c.logVerbose("onCompleted", new Object[0]);
        this.f87097d.post(new aqyh(this, bootstrapCompletionResult));
    }

    /* renamed from: a */
    public final void mo48269a(BootstrapOptions bootstrapOptions) {
        f87094c.logVerbose("onBootstrapOptions", new Object[0]);
        this.f87097d.post(new aqyj(this, bootstrapOptions));
    }

    /* renamed from: a */
    public final void mo48270a(BootstrapProgressResult bootstrapProgressResult) {
        f87094c.logVerbose("onProgress", new Object[0]);
        this.f87097d.post(new aqyi(this, bootstrapProgressResult));
    }

    /* renamed from: a */
    public final void mo48271a(byte[] bArr) {
        asco asco = f87094c;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Received ");
        sb.append(length);
        sb.append(" bytes of data.");
        asco.logVerbose(sb.toString(), new Object[0]);
        try {
            if (this.f87098e.mo66813a()) {
                ((arae) this.f87098e.mo66814b()).f87191c.write(bArr);
            } else {
                mo48265a(13, "didn't set up pipe.");
            }
        } catch (IOException e) {
            f87094c.mo25410a((Throwable) e);
            mo48265a(10576, "IOException while writing to stream.");
        }
    }
}
