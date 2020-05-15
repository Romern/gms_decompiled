package p000;

import android.content.Context;
import com.google.android.gms.autofill.data.Credential;

/* renamed from: lka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lka implements lis {

    /* renamed from: a */
    private final Context f26238a;

    /* renamed from: b */
    private final String f26239b;

    /* renamed from: c */
    private final Credential f26240c;

    public lka(Context context, String str, Credential credential) {
        this.f26238a = context.getApplicationContext();
        this.f26239b = String.format("%s|%s|%s", str, credential.f11610c.f23841b, credential.f11608a);
        this.f26240c = credential;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return this.f26239b;
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        return ((kfx) krc.m18382a(this.f26238a).mo14825a(this.f26238a).mo14868f().mo66814b()).mo14454a(snp.m35702a(9), this.f26240c);
    }
}
