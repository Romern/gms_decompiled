package p000;

import com.google.android.gms.autofill.data.Credential;
import java.util.List;

/* renamed from: kfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kfs implements kfw {

    /* renamed from: a */
    private final String f24006a;

    /* renamed from: b */
    private final kcv f24007b;

    public kfs(Credential credential) {
        this.f24006a = credential.f11608a;
        this.f24007b = credential.f11610c;
    }

    /* renamed from: a */
    public final bnic mo14450a() {
        return bnon.f131923a;
    }

    /* renamed from: a */
    public final bnic mo14451a(List list, kcv kcv) {
        return bnic.m109489a(kcv);
    }

    /* renamed from: a */
    public final String mo14452a(List list) {
        String str = this.f24006a;
        kcv kcv = this.f24007b;
        return "(" + kfx.m17785a(bnic.m109489a(kcv)) + ") AND (idx_username = '" + kfx.m17786a(str) + "')";
    }
}
