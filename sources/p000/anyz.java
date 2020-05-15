package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: anyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anyz extends FragmentActivity implements anxy {

    /* renamed from: a */
    protected String f77900a;

    /* renamed from: b */
    protected String f77901b;

    /* renamed from: c */
    public int f77902c;

    /* renamed from: a */
    private final ClickableSpan m65602a(String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.plus.oob.UpgradeAccountInfoActivity").putExtra("title", str2).putExtra("text", str).putExtra("button_text", (String) null).putExtra("com.google.android.gms.plus.OVERRIDE_THEME", this.f77902c);
        putExtra.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", this.f77900a);
        putExtra.putExtra("com.google.android.gms.common.oob.EXTRAS_CLIENT_CALLING_APP_PACKAGE", this.f77901b);
        return new anxw(this, new anxu(putExtra), new anxv(this, this.f77900a, mo42412bH(), favaDiagnosticsEntity, this.f77901b));
    }

    /* renamed from: a */
    public void mo42408a() {
    }

    /* renamed from: b */
    public final void mo42411b(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        shz.m35338a(this, this.f77900a, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f77901b);
    }

    /* renamed from: bH */
    public final FavaDiagnosticsEntity mo42412bH() {
        if (mo42476c()) {
            return rin.f43082g;
        }
        return rin.f43077b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo42476c() {
        int i = Build.VERSION.SDK_INT;
        return this.f77902c == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo42477d() {
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo42478e() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f77902c = getIntent().getIntExtra("com.google.android.gms.plus.OVERRIDE_THEME", 0);
        if (mo42476c()) {
            setTheme(16973931);
        } else if (this.f77902c != 1) {
            setTheme(2132019651);
        } else {
            setTheme(2132019650);
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("com.google.android.gms.common.oob.EXTRAS_CLIENT_CALLING_APP_PACKAGE");
        this.f77901b = string;
        if (string == null) {
            Log.e("UpgradeAccount", "Required client calling package extra is unspecified");
            mo42478e();
            return;
        }
        String string2 = extras.getString("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME");
        this.f77900a = string2;
        if (TextUtils.isEmpty(string2)) {
            Log.e("UpgradeAccount", "Required account name extra is unspecified");
            mo42478e();
        }
    }

    /* renamed from: a */
    private final ClickableSpan m65603a(String str, String str2, String str3) {
        return new anzf(this, str, str2, str3);
    }

    /* renamed from: a */
    public final ClickableSpan mo42402a(aodu aodu) {
        String str;
        String str2 = null;
        if (aodu.mo42562f()) {
            str = aodu.mo42561d().toString();
        } else {
            str = null;
        }
        if (aodu.mo42564h()) {
            str2 = aodu.mo42563g().toString();
        }
        return m65602a(str, str2, rin.f43076a);
    }

    /* renamed from: a */
    public final ClickableSpan mo42403a(aoii aoii) {
        String str;
        String str2 = null;
        if (aoii.mo42809f()) {
            str = aoii.mo42808d().toString();
        } else {
            str = null;
        }
        if (aoii.mo42811h()) {
            str2 = aoii.mo42810g().toString();
        }
        return m65602a(str, str2, rin.f43076a);
    }

    /* renamed from: a */
    public final ClickableSpan mo42404a(String str, aodu aodu, String str2) {
        String str3 = null;
        if (aodu != null && aodu.mo42564h()) {
            str3 = aodu.mo42563g().toString();
        }
        return m65603a(str, str3, str2);
    }

    /* renamed from: a */
    public final ClickableSpan mo42405a(String str, aodw aodw) {
        String str2;
        FavaDiagnosticsEntity favaDiagnosticsEntity;
        String str3 = null;
        if (aodw.mo42574f()) {
            str2 = aodw.mo42573d().toString();
        } else {
            str2 = null;
        }
        if (aodw.mo42576h()) {
            str3 = aodw.mo42575g().toString();
        }
        if ("picasa".equals(str)) {
            favaDiagnosticsEntity = rin.f43081f;
        } else {
            favaDiagnosticsEntity = rin.f43076a;
        }
        return m65602a(str2, str3, favaDiagnosticsEntity);
    }

    /* renamed from: a */
    public final ClickableSpan mo42406a(String str, aodw aodw, String str2) {
        String str3 = null;
        if (aodw != null && aodw.mo42576h()) {
            str3 = aodw.mo42575g().toString();
        }
        return m65603a(str, str3, str2);
    }

    /* renamed from: a */
    public final ClickableSpan mo42407a(String str, aoii aoii, String str2) {
        String str3 = null;
        if (aoii != null && aoii.mo42811h()) {
            str3 = aoii.mo42810g().toString();
        }
        return m65603a(str, str3, str2);
    }

    /* renamed from: a */
    public final void mo42409a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        mo42410a(favaDiagnosticsEntity, mo42412bH());
    }

    /* renamed from: a */
    public final void mo42410a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        shz.m35339a(this, this.f77900a, (String) null, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f77901b);
    }
}
