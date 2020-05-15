package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: dzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzv extends dyg {

    /* renamed from: b */
    public static final dxr f14493b = new dxr(new dzs(), "PlacesProducer", new int[]{18, 60}, new int[]{7});

    /* renamed from: k */
    private final dzz f14494k = new dzz(cdgr.f180817aG, cdgr.f180816aF, cdgr.f180815aE);

    /* renamed from: l */
    private final aemi f14495l;

    /* renamed from: m */
    private PendingIntent f14496m = null;

    /* renamed from: n */
    private final HashSet f14497n = new HashSet();

    /* renamed from: o */
    private boolean f14498o;

    /* renamed from: p */
    private int f14499p;

    /* renamed from: q */
    private long f14500q;

    /* renamed from: r */
    private final Runnable f14501r;

    /* renamed from: s */
    private int f14502s;

    /* renamed from: t */
    private long f14503t;

    public dzv(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14493b, str, dqb);
        aemh aemh = new aemh();
        aemh.f63516b = "com.google.android.contextmanager.producer.module.PlacesProducer";
        aemh.mo34328a();
        if (!doh.mo9338b()) {
            aemh.f63518d = doh.f13690b;
        }
        this.f14495l = aemh.mo34328a();
        this.f14498o = false;
        this.f14499p = 0;
        this.f14500q = -1;
        this.f14501r = new dzt(this);
        this.f14502s = -1;
        this.f14503t = Long.MAX_VALUE;
    }

    /* renamed from: a */
    public static bxmm m9920a(aelh aelh, double d, int i, double d2, List list) {
        if (aelh == null) {
            return null;
        }
        bxml bxml = (bxml) bxmm.f163946s.mo74144da();
        if (bxml.f164950c) {
            bxml.mo74035c();
            bxml.f164950c = false;
        }
        bxmm bxmm = (bxmm) bxml.f164949b;
        int i2 = bxmm.f163948a | 1;
        bxmm.f163948a = i2;
        bxmm.f163949b = d;
        int i3 = i2 | 8192;
        bxmm.f163948a = i3;
        bxmm.f163963q = d2;
        bxmm.f163948a = i3 | 4096;
        bxmm.f163962p = i;
        if (list != null) {
            bxml.mo73590a(list);
        }
        CharSequence r = aelh.mo8025r();
        if (r != null) {
            String charSequence = r.toString();
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxmm bxmm2 = (bxmm) bxml.f164949b;
            charSequence.getClass();
            bxmm2.f163948a |= 2;
            bxmm2.f163950c = charSequence;
        }
        String a = aelh.mo8007a();
        if (a != null) {
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxmm bxmm3 = (bxmm) bxml.f164949b;
            a.getClass();
            bxmm3.f163948a |= 4;
            bxmm3.f163951d = a;
        }
        Locale c = aelh.mo8009c();
        if (c != null) {
            String displayName = c.getDisplayName();
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxmm bxmm4 = (bxmm) bxml.f164949b;
            displayName.getClass();
            bxmm4.f163948a |= 8;
            bxmm4.f163952e = displayName;
        }
        CharSequence q = aelh.mo8024q();
        if (q != null) {
            String charSequence2 = q.toString();
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxmm bxmm5 = (bxmm) bxml.f164949b;
            charSequence2.getClass();
            bxmm5.f163948a |= 16;
            bxmm5.f163953f = charSequence2;
        }
        CharSequence p = aelh.mo8023p();
        if (p != null) {
            String charSequence3 = p.toString();
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxmm bxmm6 = (bxmm) bxml.f164949b;
            charSequence3.getClass();
            bxmm6.f163948a |= 32;
            bxmm6.f163954g = charSequence3;
        }
        int m = aelh.mo8020m();
        if (bxml.f164950c) {
            bxml.mo74035c();
            bxml.f164950c = false;
        }
        bxmm bxmm7 = (bxmm) bxml.f164949b;
        bxmm7.f163948a |= 128;
        bxmm7.f163956i = m;
        float l = aelh.mo8019l();
        if (bxml.f164950c) {
            bxml.mo74035c();
            bxml.f164950c = false;
        }
        bxmm bxmm8 = (bxmm) bxml.f164949b;
        bxmm8.f163948a |= 64;
        bxmm8.f163955h = l;
        boolean k = aelh.mo8018k();
        if (bxml.f164950c) {
            bxml.mo74035c();
            bxml.f164950c = false;
        }
        bxmm bxmm9 = (bxmm) bxml.f164949b;
        bxmm9.f163948a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bxmm9.f163957j = k;
        Uri i4 = aelh.mo8016i();
        if (i4 != null) {
            String encodedPath = i4.getEncodedPath();
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxmm bxmm10 = (bxmm) bxml.f164949b;
            encodedPath.getClass();
            bxmm10.f163948a |= 512;
            bxmm10.f163958k = encodedPath;
        }
        List<Integer> b = aelh.mo8008b();
        if (b != null) {
            for (Integer num : b) {
                bvoq a2 = bvoq.m121324a(num.intValue());
                if (a2 == null) {
                    a2 = bvoq.OTHER;
                }
                if (bxml.f164950c) {
                    bxml.mo74035c();
                    bxml.f164950c = false;
                }
                bxmm bxmm11 = (bxmm) bxml.f164949b;
                a2.getClass();
                if (!bxmm11.f163961n.mo73666a()) {
                    bxmm11.f163961n = bxvk.m124019a(bxmm11.f163961n);
                }
                bxmm11.f163961n.mo74153d(a2.f157198bx);
            }
            LatLng d3 = aelh.mo8010d();
            if (d3 != null) {
                int b2 = ayuo.m84849b(d3.f79894a);
                if (bxml.f164950c) {
                    bxml.mo74035c();
                    bxml.f164950c = false;
                }
                bxmm bxmm12 = (bxmm) bxml.f164949b;
                bxmm12.f163948a |= 1024;
                bxmm12.f163959l = b2;
                int b3 = ayuo.m84849b(d3.f79895b);
                if (bxml.f164950c) {
                    bxml.mo74035c();
                    bxml.f164950c = false;
                }
                bxmm bxmm13 = (bxmm) bxml.f164949b;
                bxmm13.f163948a |= 2048;
                bxmm13.f163960m = b3;
            }
        }
        return (bxmm) bxml.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        if (this.f14496m != null) {
            aema.m52141a(this.f14388d, this.f14495l).mo34302f(this.f14496m).mo50371a(new dqi("[PlacesProducer] removePlaceUpdates", new Object[0]));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.gms.contextmanager.PLACE_UPDATES");
        return intentFilter;
    }

    /* renamed from: j */
    public final void mo9892j() {
        long a = dwq.m9665i().mo20505a();
        if (!this.f14497n.isEmpty() && this.f14498o && this.f14499p <= ((int) cdgp.f180782a.mo6606a().mo77575at())) {
            long j = this.f14500q;
            if (j == -1 || a <= j + cdgp.m133191A()) {
                if (this.f14500q == -1) {
                    this.f14500q = dwq.m9665i().mo20505a();
                }
                m9921a((int) cdgp.m133215x(), cdgp.m133217z());
                dwq.m9667k().mo9434a(this.f14501r, cdgp.m133191A(), dqy.m9123a("updatePlaceUpdatesIfNecessary"));
                return;
            }
        }
        this.f14500q = -1;
        dzz dzz = this.f14494k;
        m9921a(dzz.f14510b, dzz.f14511c);
    }

    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        if (contextData.mo18018g() != 7) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dzv", "b", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("[PlacesProducer] Context %s is being received by producer %s and not handled.", Integer.toString(contextData.mo18018g()), "PlacesProducer");
        } else if (contextData.mo18022j().mo26616b()) {
            bxmz bxmz = (bxmz) contextData.mo18009a(bxmz.f164000d);
            if (bxmz == null) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dzv", "b", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[PlacesProducer] Could not get screen proto.");
                return;
            }
            int i = 1;
            Object[] objArr = new Object[1];
            int a = bxmy.m122885a(bxmz.f164003b);
            if (a == 0) {
                a = 1;
            }
            objArr[0] = Integer.valueOf(a - 1);
            int a2 = bxmy.m122885a(bxmz.f164003b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                    bnsl3.mo68432a("dzv", "a", 512, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    int a3 = bxmy.m122885a(bxmz.f164003b);
                    if (a3 != 0) {
                        i = a3;
                    }
                    bnsl3.mo68409a("[PlacesProducer] Unknown screen state=%s", i - 1);
                } else if (!this.f14498o) {
                    this.f14498o = true;
                    this.f14499p = 0;
                    mo9892j();
                }
            } else if (this.f14498o) {
                this.f14498o = false;
                mo9892j();
            }
        }
    }

    /* renamed from: a */
    private final void m9921a(int i, long j) {
        if (this.f14502s != i || this.f14503t != j) {
            Integer valueOf = Integer.valueOf(i);
            Long valueOf2 = Long.valueOf(j);
            Object[] objArr = {valueOf, valueOf2};
            if (this.f14496m == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dzv", "a", 569, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PlacesProducer] NULL pendingIntent! dropping update request!");
                return;
            }
            this.f14502s = i;
            this.f14503t = j;
            aely aely = new aely();
            aely.f63498a = new PlaceFilter();
            aely.f63499b = this.f14503t;
            aely.f63500c = this.f14502s;
            aema.m52141a(this.f14388d, this.f14495l).mo34300a(aely.mo34318a(), this.f14496m).mo50371a(new dqi("[PlacesProducer] requestPlaceUpdates, priority=%s, interval=%s", valueOf, valueOf2));
        }
    }

    /* renamed from: a */
    private final void m9922a(bxmz bxmz) {
        if (bxmz != null) {
            int i = 1;
            Object[] objArr = new Object[1];
            int a = bxmy.m122885a(bxmz.f164003b);
            if (a == 0) {
                a = 1;
            }
            objArr[0] = Integer.valueOf(a - 1);
            int a2 = bxmy.m122885a(bxmz.f164003b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dzv", "a", 512, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    int a3 = bxmy.m122885a(bxmz.f164003b);
                    if (a3 != 0) {
                        i = a3;
                    }
                    bnsl.mo68409a("[PlacesProducer] Unknown screen state=%s", i - 1);
                } else if (!this.f14498o) {
                    this.f14498o = true;
                    this.f14499p = 0;
                    mo9892j();
                }
            } else if (this.f14498o) {
                this.f14498o = false;
                mo9892j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0255  */
    /* renamed from: a */
    private final boolean m9923a(Intent intent) {
        aela aela;
        aelr aelr;
        ArrayList b;
        Intent intent2 = intent;
        sdo.m34966a(this.f14388d, "context must not be null");
        if (intent2 == null || !intent2.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY") || !intent2.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY") || !intent2.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY") || (b = sef.m35076b(intent2, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY", HierarchicalPlaceLikelihoodEntity.CREATOR)) == null) {
            aela = null;
        } else {
            Status status = (Status) sef.m35067a(intent2, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY", Status.CREATOR);
            if (status == null) {
                status = Status.f30109c;
            }
            int intExtra = intent2.getIntExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", -1);
            rtu a = DataHolder.m22537a(aeok.f63573b);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) b.get(i);
                ContentValues s = hierarchicalPlaceLikelihoodEntity.f79528b.mo43688s();
                s.put("place_likelihood", Float.valueOf(hierarchicalPlaceLikelihoodEntity.f79530d));
                s.put("place_hierarchy_level", Integer.valueOf(hierarchicalPlaceLikelihoodEntity.f79531e));
                s.put("place_contained_place_ids", rtr.m34418c(hierarchicalPlaceLikelihoodEntity.f79532f));
                s.put("data", sef.m35074a(hierarchicalPlaceLikelihoodEntity));
                a.mo25160a(s);
                linkedHashSet.addAll(hierarchicalPlaceLikelihoodEntity.f79528b.f79548n);
            }
            String a2 = aemu.m52174a(linkedHashSet);
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(a2)) {
                bundle.putString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY", a2);
            }
            aela = new aela(a.mo25164a(status.f30115i, bundle), intent2.getBooleanExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY", false), intExtra);
        }
        if (aela == null) {
            return false;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(aela.mo24660a());
            Iterator it = aela.iterator();
            while (it.hasNext()) {
                aekz aekz = (aekz) it.next();
                if (aekz != null) {
                    aelh bB = aekz.mo25149bB();
                    if (bB == null || bB.mo8007a() == null || bB.mo8007a().isEmpty()) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dzv", "a", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("[PlacesProducer] unable to find PlaceId for HierarchicalPlaceLikelihood place %s", bB);
                    } else {
                        linkedHashMap.put(bB.mo8007a(), m9920a(aekz.mo25149bB(), -1.0d, aekz.mo25157s(), (double) aekz.mo25148bA(), aekz.mo25158t()));
                    }
                } else {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                    bnsl2.mo68432a("dzv", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[PlacesProducer] hierarchicalPlaceLikelihood is null1");
                }
            }
            aelr a3 = aelr.m52131a(intent);
            if (a3 != null) {
                try {
                    Iterator it2 = a3.iterator();
                    while (it2.hasNext()) {
                        aelp aelp = (aelp) it2.next();
                        if (aelp != null) {
                            aelh bB2 = aelp.mo8029bB();
                            if (bB2 != null) {
                                if (bB2.mo8007a() != null && !bB2.mo8007a().isEmpty()) {
                                    bxmm bxmm = (bxmm) linkedHashMap.get(bB2.mo8007a());
                                    if (bxmm != null) {
                                        String a4 = bB2.mo8007a();
                                        bxvd bxvd = (bxvd) bxmm.mo74142c(5);
                                        bxvd.mo73625a((bxvk) bxmm);
                                        bxml bxml = (bxml) bxvd;
                                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                                        double bA = (double) aelp.mo8028bA();
                                        if (bxml.f164950c) {
                                            bxml.mo74035c();
                                            bxml.f164950c = false;
                                        }
                                        bxmm bxmm2 = (bxmm) bxml.f164949b;
                                        bxmm2.f163948a |= 1;
                                        bxmm2.f163949b = bA;
                                        linkedHashMap = linkedHashMap2;
                                        linkedHashMap.put(a4, (bxmm) bxml.mo74062i());
                                    } else {
                                        bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                                        bnsl3.mo68432a("dzv", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68420a("[PlacesProducer] No hierarchical record found for %s", (Object) null);
                                    }
                                }
                            }
                            bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                            bnsl4.mo68432a("dzv", "a", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68420a("[PlacesProducer] unable to find PlaceId for PlaceLikelihood place %s", bB2);
                        } else {
                            bnsl bnsl5 = (bnsl) dss.f13961a.mo68388c();
                            bnsl5.mo68432a("dzv", "a", 353, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68405a("[PlacesProducer] placeLikelihood is null1");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    aelr = a3;
                    aela.mo12460c();
                    if (aelr != null) {
                        aelr.mo12460c();
                    }
                    throw th;
                }
            } else {
                bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                bnsl6.mo68432a("dzv", "a", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("[PlacesProducer] Unexpected condition: PlaceLikelihoodBuffer.readFromIntent is null.");
            }
            Collection values = linkedHashMap.values();
            bxmn bxmn = (bxmn) bxmo.f163965b.mo74144da();
            bxmn.mo73591a(values);
            new Object[1][0] = Integer.valueOf(((bxmo) bxmn.f164949b).f163968a.size());
            tip tip = new tip(7, 18, 1);
            tip.mo26572a(bxmo.f163966c, (bxmo) bxmn.mo74062i());
            mo9856c(tip.mo26570a());
            aela.mo12460c();
            if (a3 != null) {
                a3.mo12460c();
            }
            this.f14499p++;
            mo9892j();
            return true;
        } catch (Throwable th2) {
            th = th2;
            aelr = null;
            aela.mo12460c();
            if (aelr != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        Intent intent = new Intent("android.gms.contextmanager.PLACE_UPDATES");
        intent.setPackage("com.google.android.gms");
        this.f14496m = PendingIntent.getBroadcast(this.f14388d, this.f14389e.hashCode(), intent, 134217728);
        dzz dzz = this.f14494k;
        m9921a(dzz.f14510b, dzz.f14511c);
        tit tit = new tit();
        tit.mo26579a(7);
        lrh.m19580d(this.f14388d, this.f14391g).mo24702a(tit.mo26578a()).mo50371a(new dzu(this, "[PlacesProducer] get current screen context", new Object[0]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0270  */
    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        aela aela;
        aelr aelr;
        String str;
        ArrayList b;
        Intent intent2 = intent;
        if (intent.getAction().equals("android.gms.contextmanager.PLACE_UPDATES")) {
            sdo.m34966a(this.f14388d, "context must not be null");
            if (intent2 == null || !intent2.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY") || !intent2.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY") || !intent2.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY") || (b = sef.m35076b(intent2, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY", HierarchicalPlaceLikelihoodEntity.CREATOR)) == null) {
                aela = null;
            } else {
                Status status = (Status) sef.m35067a(intent2, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY", Status.CREATOR);
                if (status == null) {
                    status = Status.f30109c;
                }
                int intExtra = intent2.getIntExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", -1);
                rtu a = DataHolder.m22537a(aeok.f63573b);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) b.get(i);
                    ContentValues s = hierarchicalPlaceLikelihoodEntity.f79528b.mo43688s();
                    s.put("place_likelihood", Float.valueOf(hierarchicalPlaceLikelihoodEntity.f79530d));
                    s.put("place_hierarchy_level", Integer.valueOf(hierarchicalPlaceLikelihoodEntity.f79531e));
                    s.put("place_contained_place_ids", rtr.m34418c(hierarchicalPlaceLikelihoodEntity.f79532f));
                    s.put("data", sef.m35074a(hierarchicalPlaceLikelihoodEntity));
                    a.mo25160a(s);
                    linkedHashSet.addAll(hierarchicalPlaceLikelihoodEntity.f79528b.f79548n);
                }
                String a2 = aemu.m52174a(linkedHashSet);
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(a2)) {
                    bundle.putString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY", a2);
                }
                aela = new aela(a.mo25164a(status.f30115i, bundle), intent2.getBooleanExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY", false), intExtra);
            }
            String str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            if (aela != null) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(aela.mo24660a());
                    Iterator it = aela.iterator();
                    while (it.hasNext()) {
                        aekz aekz = (aekz) it.next();
                        if (aekz != null) {
                            aelh bB = aekz.mo25149bB();
                            if (bB == null || bB.mo8007a() == null || bB.mo8007a().isEmpty()) {
                                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                                bnsl.mo68432a("dzv", "a", 328, str2);
                                bnsl.mo68420a("[PlacesProducer] unable to find PlaceId for HierarchicalPlaceLikelihood place %s", bB);
                            } else {
                                linkedHashMap.put(bB.mo8007a(), m9920a(aekz.mo25149bB(), -1.0d, aekz.mo25157s(), (double) aekz.mo25148bA(), aekz.mo25158t()));
                            }
                        } else {
                            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                            bnsl2.mo68432a("dzv", "a", 321, str2);
                            bnsl2.mo68405a("[PlacesProducer] hierarchicalPlaceLikelihood is null1");
                        }
                    }
                    aelr a3 = aelr.m52131a(intent);
                    if (a3 != null) {
                        try {
                            Iterator it2 = a3.iterator();
                            while (it2.hasNext()) {
                                aelp aelp = (aelp) it2.next();
                                if (aelp != null) {
                                    aelh bB2 = aelp.mo8029bB();
                                    if (bB2 == null) {
                                        str = str2;
                                    } else if (bB2.mo8007a() == null || bB2.mo8007a().isEmpty()) {
                                        str = str2;
                                    } else {
                                        bxmm bxmm = (bxmm) linkedHashMap.get(bB2.mo8007a());
                                        if (bxmm != null) {
                                            String a4 = bB2.mo8007a();
                                            bxvd bxvd = (bxvd) bxmm.mo74142c(5);
                                            bxvd.mo73625a((bxvk) bxmm);
                                            bxml bxml = (bxml) bxvd;
                                            String str3 = str2;
                                            double bA = (double) aelp.mo8028bA();
                                            if (bxml.f164950c) {
                                                bxml.mo74035c();
                                                bxml.f164950c = false;
                                            }
                                            bxmm bxmm2 = (bxmm) bxml.f164949b;
                                            bxmm2.f163948a |= 1;
                                            bxmm2.f163949b = bA;
                                            linkedHashMap.put(a4, (bxmm) bxml.mo74062i());
                                            str2 = str3;
                                        } else {
                                            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                                            bnsl3.mo68432a("dzv", "a", 367, str2);
                                            bnsl3.mo68420a("[PlacesProducer] No hierarchical record found for %s", (Object) null);
                                            str2 = str2;
                                        }
                                    }
                                    bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                                    bnsl4.mo68432a("dzv", "a", 360, str);
                                    bnsl4.mo68420a("[PlacesProducer] unable to find PlaceId for PlaceLikelihood place %s", bB2);
                                    str2 = str;
                                } else {
                                    bnsl bnsl5 = (bnsl) dss.f13961a.mo68388c();
                                    bnsl5.mo68432a("dzv", "a", 353, str2);
                                    bnsl5.mo68405a("[PlacesProducer] placeLikelihood is null1");
                                    str2 = str2;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            aelr = a3;
                            aela.mo12460c();
                            if (aelr != null) {
                                aelr.mo12460c();
                            }
                            throw th;
                        }
                    } else {
                        bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                        bnsl6.mo68432a("dzv", "a", 346, str2);
                        bnsl6.mo68405a("[PlacesProducer] Unexpected condition: PlaceLikelihoodBuffer.readFromIntent is null.");
                    }
                    Collection values = linkedHashMap.values();
                    bxmn bxmn = (bxmn) bxmo.f163965b.mo74144da();
                    bxmn.mo73591a(values);
                    new Object[1][0] = Integer.valueOf(((bxmo) bxmn.f164949b).f163968a.size());
                    tip tip = new tip(7, 18, 1);
                    tip.mo26572a(bxmo.f163966c, (bxmo) bxmn.mo74062i());
                    mo9856c(tip.mo26570a());
                    aela.mo12460c();
                    if (a3 != null) {
                        a3.mo12460c();
                    }
                    this.f14499p++;
                    mo9892j();
                } catch (Throwable th2) {
                    th = th2;
                    aelr = null;
                    aela.mo12460c();
                    if (aelr != null) {
                    }
                    throw th;
                }
            } else {
                bnsl bnsl7 = (bnsl) dss.f13961a.mo68388c();
                bnsl7.mo68432a("dzv", "a", 273, str2);
                bnsl7.mo68405a("[PlacesProducer] Received an intent but no PlaceLikelihoodBuffer or NearbyLikelihoodBuffer");
            }
        }
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        new Object[1][0] = dwa;
        if (dwa.mo9752f()) {
            int a = dwa.mo9753g().mo9780a();
            if (!(a == 2 || a == 3)) {
                if (a == 5) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dzv", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[PlacesProducer]Unexpected ProductionPolicy");
                    return;
                } else if (a != 6) {
                    if (a != 7) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a("dzv", "a", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("[PlacesProducer] Not handling onRemovedInterest production policy type=%s", Integer.toString(dwa.mo9753g().mo9780a()));
                        return;
                    } else if (this.f14497n.remove(dwa)) {
                        mo9892j();
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (this.f14494k.mo9897a(dwa)) {
                mo9892j();
            }
        }
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        Object[] objArr = {dwa, dwa2};
        boolean a = this.f14494k.mo9898a(dwa, dwa2);
        if (dwa.mo9752f()) {
            int a2 = dwa.mo9753g().mo9780a();
            if (a2 == 5) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dzv", "a", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PlacesProducer]Unexpected ProductionPolicy");
            } else if (a2 != 7) {
                new Object[1][0] = Integer.toString(dwa.mo9753g().mo9780a());
            } else {
                a |= this.f14497n.add(dwa);
            }
        }
        if (dwa2 != null && dwa2.mo9752f()) {
            int a3 = dwa2.mo9753g().mo9780a();
            if (a3 == 5) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dzv", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[PlacesProducer]Unexpected ProductionPolicy");
            } else if (a3 != 7) {
                new Object[1][0] = Integer.toString(dwa2.mo9753g().mo9780a());
            } else {
                a |= this.f14497n.remove(dwa2);
            }
        }
        if (a) {
            mo9892j();
        }
    }
}
