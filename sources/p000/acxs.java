package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxs {

    /* renamed from: a */
    private final Context f61053a;

    /* renamed from: b */
    private final acxp f61054b;

    /* renamed from: c */
    private final abym f61055c;

    /* renamed from: d */
    private final acxo f61056d;

    /* renamed from: e */
    private final rjx f61057e;

    public acxs(Context context, acxo acxo, abzo abzo, abyx abyx, abym abym) {
        acxp acxp = new acxp(context.getPackageManager(), abzo, abyx);
        rjx a = fqj.m12175a(context);
        this.f61053a = context;
        this.f61054b = acxp;
        this.f61055c = abym;
        this.f61056d = acxo;
        this.f61057e = a;
    }

    /* renamed from: a */
    public static abto m49969a(absr absr, abuu abuu) {
        bxvd da = abto.f58276i.mo74144da();
        long j = absr.f58144i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abto abto = (abto) da.f164949b;
        int i = abto.f58278a | 1;
        abto.f58278a = i;
        abto.f58279b = j;
        String str = abuu.f58476f;
        str.getClass();
        int i2 = i | 2;
        abto.f58278a = i2;
        abto.f58280c = str;
        long j2 = abuu.f58477g;
        abto.f58278a = i2 | 8;
        abto.f58281d = (int) (j2 / 1000);
        abuy a = abuy.m48299a(abuu.f58478h);
        if (a == null) {
            a = abuy.GENERAL_USE;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abto abto2 = (abto) da.f164949b;
        abto2.f58282e = a.f58502g;
        abto2.f58278a |= 16;
        abtc a2 = abtc.m48241a(abuu.f58482l);
        if (a2 == null) {
            a2 = abtc.UNKNOWN;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abto abto3 = (abto) da.f164949b;
        abto3.f58285h = a2.f58200d;
        int i3 = abto3.f58278a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        abto3.f58278a = i3;
        int i4 = abuu.f58480j;
        int i5 = i3 | 64;
        abto3.f58278a = i5;
        abto3.f58283f = i4;
        boolean z = abuu.f58481k;
        abto3.f58278a = i5 | 128;
        abto3.f58284g = z;
        return (abto) da.mo74062i();
    }

    /* renamed from: a */
    public final acwo mo33220a() {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        Throwable e;
        acxo acxo = this.f61056d;
        if (acxo != null) {
            parcelFileDescriptor = acxo.mo33212a();
        } else {
            parcelFileDescriptor = null;
        }
        try {
            rjx rjx = this.f61057e;
            roz b = rpa.m34196b();
            b.f43472a = fto.f17222a;
            parcelFileDescriptor2 = (ParcelFileDescriptor) aucu.m76783a(rjx.mo24701a(b.mo24977a()), ((Long) abzt.f58842J.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
            try {
                this.f61055c.mo32453b(6010);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            parcelFileDescriptor2 = null;
            e = e3;
            this.f61055c.mo32453b(6004);
            absg.m48200c(e, "Usage reports not received in time.", new Object[0]);
            acxb acxb = new acxb(this.f61053a);
            return new acxf(new acxr(acxo.m49958a(parcelFileDescriptor), parcelFileDescriptor, this.f61054b, acxb), new acxr(acxo.m49958a(parcelFileDescriptor2), parcelFileDescriptor2, this.f61054b, acxb));
        }
        acxb acxb2 = new acxb(this.f61053a);
        return new acxf(new acxr(acxo.m49958a(parcelFileDescriptor), parcelFileDescriptor, this.f61054b, acxb2), new acxr(acxo.m49958a(parcelFileDescriptor2), parcelFileDescriptor2, this.f61054b, acxb2));
    }
}
