package p000;

import android.app.backup.BackupDataInput;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;

/* renamed from: ncq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncq implements nca {

    /* renamed from: a */
    public mcx f35294a = mcx.f33458b;

    /* renamed from: b */
    public C1578nbu f35295b;

    /* renamed from: c */
    private final BackupDataInput f35296c;

    public ncq(BackupDataInput backupDataInput) {
        this.f35296c = backupDataInput;
    }

    /* renamed from: a */
    private static bmxv m25942a(BackupDataInput backupDataInput) {
        if (backupDataInput.getDataSize() < 0) {
            return bmvz.f131120a;
        }
        int dataSize = backupDataInput.getDataSize();
        byte[] bArr = new byte[dataSize];
        int i = 0;
        while (i < dataSize) {
            i += backupDataInput.readEntityData(bArr, i, dataSize - i);
        }
        return bmxv.m108566b(bArr);
    }

    /* renamed from: a */
    private final void m25943a(Map map, naz naz, nay nay, bngs bngs, bngs bngs2, String str, bmxv bmxv) {
        map.remove(str);
        if (bmxv.mo66813a()) {
            byte[] bArr = (byte[]) bmxv.mo66814b();
            bxvd da = mcy.f33461d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mcy mcy = (mcy) da.f164949b;
            str.getClass();
            mcy.f33463a |= 1;
            mcy.f33464b = str;
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mcy mcy2 = (mcy) da.f164949b;
            a.getClass();
            mcy2.f33463a |= 2;
            mcy2.f33465c = a;
            byte[] k = ((mcy) da.mo74062i()).mo73642k();
            nbc a2 = nay.mo20424a(naz.mo20425a(k), k);
            nav nav = (nav) a2;
            bngs.mo67668c(nav.f35150a);
            bngs2.mo67668c(a2);
            this.f35295b.mo20442a(str, nav.f35150a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnnt, bngx]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public final nbz mo20447a(SecretKey secretKey, byte[] bArr, Set set) {
        naz naz = new naz(secretKey);
        nay nay = new nay(secretKey, new SecureRandom());
        this.f35295b = new C1578nbu();
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        mcx mcx = this.f35294a;
        HashMap hashMap = new HashMap();
        bxwc bxwc = mcx.f33460a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            mcw mcw = (mcw) bxwc.get(i);
            hashMap.put(mcw.f33456b, new nbw(mcw.f33457c.mo73780k()));
        }
        if (!cclp.f179364a.mo6606a().mo76302e()) {
            while (this.f35296c.readNextHeader()) {
                m25943a(hashMap, naz, nay, j, j2, this.f35296c.getKey(), m25942a(this.f35296c));
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (this.f35296c.readNextHeader()) {
                linkedHashMap.put(this.f35296c.getKey(), m25942a(this.f35296c));
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                m25943a(hashMap, naz, nay, j, j2, (String) entry.getKey(), (bmxv) entry.getValue());
            }
        }
        j.mo67666b((Iterable) hashMap.values());
        bngx a = j.mo67664a();
        C1578nbu nbu = this.f35295b;
        for (Map.Entry entry2 : hashMap.entrySet()) {
            nbu.mo20442a((String) entry2.getKey(), (nbw) entry2.getValue());
        }
        bngx a2 = j2.mo67664a();
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        bnre i2 = bngx.m109369a((Comparator) bnnt.f131877a, (Iterable) a).listIterator();
        while (i2.hasNext()) {
            instance.update(((nbw) i2.next()).f35217a);
        }
        return new nbz(a, a2, instance.digest());
    }
}
