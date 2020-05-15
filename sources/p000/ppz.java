package p000;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.cast.discovery.gaia.GaiaDiscoveryStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ppz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ppz extends ppt {

    /* renamed from: d */
    public static ppz f40045d;

    /* renamed from: e */
    public static final Object f40046e = new Object();

    /* renamed from: f */
    public final Map f40047f = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    public final Map f40048g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private final Map f40049h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: finally extract failed */
    public ppz(Context context) {
        super(context, new pps(GaiaDiscoveryStorage.class, "gaia-discovery"));
        this.f40047f.clear();
        this.f40048g.clear();
        this.f40049h.clear();
        pqh l = ((GaiaDiscoveryStorage) this.f40037a).mo17582l();
        C0956ef a = C0956ef.m10280a("SELECT * FROM gaia_info", 0);
        l.f40057a.mo9943e();
        Cursor a2 = l.f40057a.mo9937a(a);
        try {
            int a3 = C0962el.m10613a(a2, "gaia_account_name");
            int a4 = C0962el.m10613a(a2, "last_updated_timestamp_ms");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                pqd pqd = new pqd(a2.getString(a3));
                pqd.f40056b = a2.getLong(a4);
                arrayList.add(pqd);
            }
            a2.close();
            a.mo10064b();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pqd pqd2 = (pqd) arrayList.get(i);
                this.f40047f.put(pqd2.f40055a, pqd2);
            }
            ppy m = ((GaiaDiscoveryStorage) this.f40037a).mo17583m();
            C0956ef a5 = C0956ef.m10280a("SELECT * FROM gaia_device_link", 0);
            m.f40042a.mo9943e();
            Cursor a6 = m.f40042a.mo9937a(a5);
            try {
                int a7 = C0962el.m10613a(a6, "gaia_account_name");
                int a8 = C0962el.m10613a(a6, "cloud_device_id");
                ArrayList arrayList2 = new ArrayList(a6.getCount());
                while (a6.moveToNext()) {
                    arrayList2.add(new ppu(a6.getString(a7), a6.getString(a8)));
                }
                a6.close();
                a5.mo10064b();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ppu ppu = (ppu) arrayList2.get(i2);
                    List list = (List) this.f40048g.get(ppu.f40040a);
                    if (list == null) {
                        list = Collections.synchronizedList(new ArrayList());
                        this.f40048g.put(ppu.f40040a, list);
                    }
                    list.add(ppu);
                }
                for (ppc ppc : ((GaiaDiscoveryStorage) this.f40037a).mo17581k().mo23530a()) {
                    this.f40049h.put(ppc.f40006b, ppc);
                }
            } catch (Throwable th) {
                a6.close();
                a5.mo10064b();
                throw th;
            }
        } catch (Throwable th2) {
            a2.close();
            a.mo10064b();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23538a() {
        pqh l = ((GaiaDiscoveryStorage) this.f40037a).mo17582l();
        l.f40057a.mo9943e();
        C0939dp b = l.f40059c.mo10124b();
        l.f40057a.mo9944f();
        try {
            b.mo9363b();
            l.f40057a.mo9946h();
            l.f40057a.mo9945g();
            l.f40059c.mo10123a(b);
            pqh l2 = ((GaiaDiscoveryStorage) this.f40037a).mo17582l();
            Collection values = this.f40047f.values();
            l2.f40057a.mo9943e();
            l2.f40057a.mo9944f();
            try {
                l2.f40058b.mo9523a(values);
                l2.f40057a.mo9946h();
                l2.f40057a.mo9945g();
                ppy m = ((GaiaDiscoveryStorage) this.f40037a).mo17583m();
                m.f40042a.mo9943e();
                C0939dp b2 = m.f40044c.mo10124b();
                m.f40042a.mo9944f();
                try {
                    b2.mo9363b();
                    m.f40042a.mo9946h();
                    m.f40042a.mo9945g();
                    m.f40044c.mo10123a(b2);
                    for (List list : this.f40048g.values()) {
                        ppy m2 = ((GaiaDiscoveryStorage) this.f40037a).mo17583m();
                        m2.f40042a.mo9943e();
                        m2.f40042a.mo9944f();
                        try {
                            m2.f40043b.mo9523a(list);
                            m2.f40042a.mo9946h();
                        } finally {
                            m2.f40042a.mo9945g();
                        }
                    }
                    ((GaiaDiscoveryStorage) this.f40037a).mo17581k().mo23532b();
                    ((GaiaDiscoveryStorage) this.f40037a).mo17581k().mo23531a(this.f40049h.values());
                } catch (Throwable th) {
                    m.f40042a.mo9945g();
                    m.f40044c.mo10123a(b2);
                    throw th;
                }
            } catch (Throwable th2) {
                l2.f40057a.mo9945g();
                throw th2;
            }
        } catch (Throwable th3) {
            l.f40057a.mo9945g();
            l.f40059c.mo10123a(b);
            throw th3;
        }
    }

    /* renamed from: b */
    public final boolean mo23547b(String str) {
        for (List list : this.f40048g.values()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(((ppu) it.next()).f40041b, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Map mo23548c() {
        return Collections.unmodifiableMap(this.f40047f);
    }

    /* renamed from: d */
    public final Map mo23549d() {
        return Collections.unmodifiableMap(this.f40049h);
    }

    /* renamed from: a */
    public final void mo23543a(ppc ppc) {
        if (mo23547b(ppc.f40006b)) {
            this.f40049h.put(ppc.f40006b, ppc);
            mo23539b();
        }
    }

    /* renamed from: a */
    public final void mo23544a(ppu ppu) {
        List list = (List) this.f40048g.get(ppu.f40040a);
        if (list != null) {
            list.remove(ppu);
            if (!mo23547b(ppu.f40041b)) {
                this.f40049h.remove(ppu.f40041b);
                mo23539b();
            }
            mo23539b();
        }
    }

    /* renamed from: a */
    public final void mo23545a(pqd pqd) {
        this.f40047f.put(pqd.f40055a, pqd);
        mo23539b();
    }

    /* renamed from: a */
    public final boolean mo23546a(String str) {
        return this.f40047f.containsKey(str);
    }
}
