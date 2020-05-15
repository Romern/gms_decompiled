package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bhtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhtb extends bhsy {

    /* renamed from: a */
    private final bhsx f119528a;

    public bhtb(bhsx bhsx) {
        this.f119528a = bhsx;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo64249a(Object obj) {
        Long l = (Long) obj;
        return 8;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo64252b(Object obj) {
        bvoa bvoa = (bvoa) obj;
        int i = bvoa.f164961ai;
        if (i == -1) {
            i = bxxm.f165037a.mo74228a(bvoa).mo74223b(bvoa);
            bvoa.f164961ai = i;
        }
        return bhsx.m101497a(i) + 4;
    }

    /* renamed from: c */
    public final bvoa mo64253b(bxuc bxuc) {
        try {
            bxuc a = bxuc.m123419a(this.f119528a.mo64248b(bxuc.mo73795e(bxuc.mo73799h())));
            bxvd da = bvoa.f156994o.mo74144da();
            da.mo73626a(a);
            return (bvoa) da.mo74062i();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Failed to read value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo64250a(bxuc bxuc) {
        return Long.valueOf(bxuc.mo73798g());
    }

    /* renamed from: a */
    public final void mo64254b(bvoa bvoa, bxuk bxuk) {
        int i = bvoa.f164961ai;
        if (i == -1) {
            i = bxxm.f165037a.mo74228a(bvoa).mo74223b(bvoa);
            bvoa.f164961ai = i;
        }
        byte[] bArr = new byte[i];
        bvoa.mo73644a(bxuk.m123637a(bArr));
        try {
            byte[] a = this.f119528a.mo64247a(bArr);
            bxuk.mo73858e(a.length);
            bxuk.mo73865b(a);
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64251a(Object obj, bxuk bxuk) {
        bxuk.mo73857d(((Long) obj).longValue());
    }
}
