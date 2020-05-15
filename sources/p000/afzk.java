package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.mdm.receivers.LockscreenChimeraReceiver;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: afzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afzk extends TracingIntentService {

    /* renamed from: a */
    protected String f65010a;

    /* renamed from: b */
    protected boolean f65011b;

    /* renamed from: c */
    public String[] f65012c;

    public afzk() {
        super("GcmReceiverChimeraService");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    public static void m53722a(Context context) {
        NfcAdapter defaultAdapter;
        afzq.m53767d(context);
        if (!cgki.m145895c() && (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) != null) {
            if (!cgki.m145897e()) {
                afzq.m53761a(defaultAdapter);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (!defaultAdapter.isSecureNfcSupported() || defaultAdapter.isSecureNfcEnabled()) {
                    afzq.m53761a(defaultAdapter);
                } else {
                    afzq.f65032a = true;
                    if (defaultAdapter.isEnabled()) {
                        defaultAdapter.enableSecureNfc(true);
                    } else {
                        defaultAdapter.enable();
                        defaultAdapter.enableSecureNfc(true);
                        defaultAdapter.disable();
                    }
                    agac.m53792b("Enable Secure NFC", new Object[0]);
                }
            }
        }
        LockscreenChimeraReceiver.m67198a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35089a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35090a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35091a(cakc cakc);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35094a(cakk cakk);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35096a(cake[] cakeArr, Location location, String str, cajz cajz, Response.Listener listener, Response.ErrorListener errorListener) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35097b(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35098b(cakc cakc);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35099b(cake cake) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            agac.m53794d("Don't call on the main thread", new Object[0]);
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        mo35093a(cake, null, this.f65010a, newFuture, newFuture);
        try {
            cakg cakg = (cakg) newFuture.get();
        } catch (InterruptedException e) {
            agac.m53791a(e, "Unable to send response", new Object[0]);
            Thread.currentThread().interrupt();
            cakg cakg2 = cakg.f174979a;
        } catch (ExecutionException e2) {
            agac.m53791a(e2, "Unable to send response", new Object[0]);
            cakg cakg3 = cakg.f174979a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo35101c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo35102d();

    public final void onCreate() {
        super.onCreate();
        this.f65012c = TextUtils.split("@googlemail.com", ",");
    }

    public afzk(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo35100b() {
        cake b = afzq.m53763b(this, true);
        if (b == cake.AUTO_ENABLE_ALREADY_DEVICE_ADMINISTRATOR || b == cake.SUCCESS) {
            return true;
        }
        agac.m53793c("Device admin policy is not auto enabled. Response code: %s", b);
        mo35094a(cakk.DEVICE_ADMIN_NOT_ENABLED);
        mo35092a(cake.UNABLE_TO_PERFORM_ACTION_NOT_DEVICE_ADMINISTRATOR);
        return false;
    }

    /* renamed from: a */
    protected static final boolean m53723a(String str, byte[] bArr) {
        byte[] a = spn.m35862a(str.toLowerCase(Locale.US), "SHA-256");
        return a != null && a.length > 0 && Arrays.equals(a, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        Throwable th;
        asfb asfb;
        if (!sre.m36080a(this) && intent != null) {
            try {
                asfb = new asfb(this, 1, "com.google.android.gms.mdm.services.GcmReceiverService", null, "com.google.android.gms", "SECURITY");
                try {
                    asfb.mo49117b();
                    mo35097b(intent);
                    if (asfb.mo49124e()) {
                        asfb.mo49120c();
                    }
                    aaks.m21408a(this, intent);
                } catch (Throwable th2) {
                    th = th2;
                    if (asfb != null && asfb.mo49124e()) {
                        asfb.mo49120c();
                    }
                    aaks.m21408a(this, intent);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                asfb = null;
                asfb.mo49120c();
                aaks.m21408a(this, intent);
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35092a(cake cake) {
        mo35093a(cake, null, this.f65010a, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35093a(cake cake, Location location, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        mo35096a(new cake[]{cake}, location, str, null, listener, errorListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35095a(boolean z) {
        mo35092a(afzq.m53763b(this, z));
    }
}
