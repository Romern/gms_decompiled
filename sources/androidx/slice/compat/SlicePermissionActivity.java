package androidx.slice.compat;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SlicePermissionActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    private Uri f1672a;

    /* renamed from: b */
    private String f1673b;

    /* renamed from: c */
    private String f1674c;

    /* renamed from: d */
    private C1350sh f1675d;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r6 = r6.substring(0, r2);
     */
    /* renamed from: a */
    private static final CharSequence m1649a(PackageManager packageManager, ApplicationInfo applicationInfo) {
        String obj = Html.fromHtml(applicationInfo.loadLabel(packageManager).toString()).toString();
        int length = obj.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int codePointAt = obj.codePointAt(i);
            int type = Character.getType(codePointAt);
            if (!(type == 13 || type == 15 || type == 14)) {
                if (type == 12) {
                    obj = obj.substring(0, i) + " " + obj.substring(Character.charCount(codePointAt) + i);
                }
                i += Character.charCount(codePointAt);
            }
        }
        String trim = obj.trim();
        if (trim.isEmpty()) {
            return applicationInfo.packageName;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(42.0f);
        return TextUtils.ellipsize(trim, textPaint, 500.0f, TextUtils.TruncateAt.END);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aqg aqg;
        if (i == -1) {
            String packageName = getPackageName();
            String str = this.f1673b;
            Uri build = this.f1672a.buildUpon().path("").build();
            try {
                ContentProviderClient acquireUnstableContentProviderClient = getContentResolver().acquireUnstableContentProviderClient(build);
                if (acquireUnstableContentProviderClient != null) {
                    aqg = new aqg(acquireUnstableContentProviderClient);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("slice_uri", build);
                    bundle.putString("provider_pkg", packageName);
                    bundle.putString("pkg", str);
                    aqg.f1989a.call("grant_perms", "supports_versioned_parcelable", bundle);
                    aqg.close();
                } else {
                    throw new IllegalArgumentException("No provider found for " + build);
                }
            } catch (RemoteException e) {
                Log.e("SliceProviderCompat", "Unable to get slice descendants", e);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        finish();
        return;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1672a = (Uri) getIntent().getParcelableExtra("slice_uri");
        this.f1673b = getIntent().getStringExtra("pkg");
        this.f1674c = getIntent().getStringExtra("provider_pkg");
        try {
            PackageManager packageManager = getPackageManager();
            String a = C1211nd.m19661a().mo15491a(m1649a(packageManager, packageManager.getApplicationInfo(this.f1673b, 0)).toString());
            String a2 = C1211nd.m19661a().mo15491a(m1649a(packageManager, packageManager.getApplicationInfo(this.f1674c, 0)).toString());
            C1349sg sgVar = new C1349sg(this);
            sgVar.mo15908b(getString(C0126R.string.abc_slice_permission_title, new Object[]{a, a2}));
            sgVar.mo15911c(C0126R.C0128layout.abc_slice_permission_request);
            sgVar.mo15892a((int) C0126R.string.abc_slice_permission_deny, this);
            sgVar.mo15906b((int) C0126R.string.abc_slice_permission_allow, this);
            sgVar.mo15894a(this);
            C1350sh c = sgVar.mo15910c();
            this.f1675d = c;
            ((TextView) c.getWindow().getDecorView().findViewById(C0126R.C0129id.text1)).setText(getString(C0126R.string.abc_slice_permission_text_1, new Object[]{a2}));
            ((TextView) this.f1675d.getWindow().getDecorView().findViewById(C0126R.C0129id.text2)).setText(getString(C0126R.string.abc_slice_permission_text_2, new Object[]{a2}));
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("SlicePermissionActivity", "Couldn't find package", e);
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C1350sh shVar = this.f1675d;
        if (shVar != null && shVar.isShowing()) {
            this.f1675d.cancel();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
