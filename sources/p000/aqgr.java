package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.security.verifier.ApkUploadEntry;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import java.util.Set;

/* renamed from: aqgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgr extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Intent f86079a;

    /* renamed from: b */
    final /* synthetic */ int f86080b;

    /* renamed from: c */
    final /* synthetic */ InternalApkUploadChimeraService f86081c;

    public aqgr(InternalApkUploadChimeraService internalApkUploadChimeraService, Intent intent, int i) {
        this.f86081c = internalApkUploadChimeraService;
        this.f86079a = intent;
        this.f86080b = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        byte[] bArr;
        int i;
        int i2;
        Void[] voidArr = (Void[]) objArr;
        InternalApkUploadChimeraService internalApkUploadChimeraService = this.f86081c;
        Intent intent = this.f86079a;
        int i3 = this.f86080b;
        int i4 = InternalApkUploadChimeraService.f107608a;
        String stringExtra = intent.getStringExtra("package_name");
        if (TextUtils.isEmpty(stringExtra)) {
            aqgy.m71600a("No package name specified", new Object[0]);
        } else if (!intent.hasExtra("version_code")) {
            aqgy.m71600a("No version code specified", new Object[0]);
        } else {
            int intExtra = intent.getIntExtra("version_code", -1);
            Object obj = intent.getExtras().get("digest");
            if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else if (obj instanceof String) {
                try {
                    bArr = spn.m35861a((String) obj);
                } catch (IllegalArgumentException e) {
                    aqgy.m71601a(e, "Provided digest is invalid", new Object[0]);
                }
            } else {
                bArr = null;
            }
            if (bArr == null || bArr.length != 32) {
                aqgy.m71600a("Incorrect digest length", new Object[0]);
            } else if (!intent.hasExtra("length")) {
                aqgy.m71600a("No length provided", new Object[0]);
            } else if (intent.getIntExtra("length", -1) >= 52428800) {
                aqgy.m71600a("Not uploading: apk is too large", new Object[0]);
            } else {
                byte[] byteArrayExtra = intent.getByteArrayExtra("token");
                if (cgkt.m145949u()) {
                    i = aqgq.m71589a(intent.getIntExtra("upload_reason", 0));
                } else {
                    i = 0;
                }
                if (i != 0) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
                internalApkUploadChimeraService.mo58949a(true);
                aqgy.m71602b("Adding apk for upload: %s:%d", stringExtra, Integer.valueOf(intExtra));
                internalApkUploadChimeraService.f107615f.mo47870b(new ApkUploadEntry(stringExtra, intExtra, bArr, byteArrayExtra, System.currentTimeMillis(), i2));
                apyk apyk = new apyk(internalApkUploadChimeraService);
                Set d = apyk.mo47707d();
                if (d.size() > 1000000) {
                    d.clear();
                }
                d.add(apgr.m70245a(bArr));
                SharedPreferences.Editor edit = apyk.f85143a.edit();
                edit.putStringSet("snet_upload_requested_apks", d);
                edit.commit();
                internalApkUploadChimeraService.f107617h.sendMessageDelayed(internalApkUploadChimeraService.f107617h.obtainMessage(0, i3, 0), (long) InternalApkUploadChimeraService.f107608a);
                return null;
            }
        }
        this.f86081c.mo58951a(this.f86080b);
        return null;
    }
}
