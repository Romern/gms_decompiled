package p000;

import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: kge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kge extends cazu {

    /* renamed from: b */
    private final cazn f24031b;

    public kge(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(kge.class), cijl);
        this.f24031b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f24031b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Credential credential = (Credential) obj;
        String str = credential.f11610c.f23841b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append(str);
        sb.append('/');
        String sb2 = sb.toString();
        bxvd da = qun.f42164n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun = (qun) da.f164949b;
        sb2.getClass();
        int i = qun.f42166a | 4;
        qun.f42166a = i;
        qun.f42168c = sb2;
        sb2.getClass();
        int i2 = i | 2;
        qun.f42166a = i2;
        qun.f42167b = sb2;
        qun.f42166a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        qun.f42173h = true;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun2 = (qun) da.f164949b;
        int i3 = qun2.f42166a | 1024;
        qun2.f42166a = i3;
        qun2.f42174i = micros;
        String str2 = credential.f11608a;
        str2.getClass();
        int i4 = i3 | 32;
        qun2.f42166a = i4;
        qun2.f42170e = str2;
        String str3 = credential.f11609b.f23889a;
        str3.getClass();
        qun2.f42166a = i4 | 128;
        qun2.f42172g = str3;
        return bqga.m112775a((qun) da.mo74062i());
    }
}
