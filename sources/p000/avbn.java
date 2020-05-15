package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbn extends avav {

    /* renamed from: a */
    private static final srn f92914a = srn.m36124a();

    /* renamed from: b */
    private final Set f92915b;

    /* renamed from: k */
    private final avcc f92916k = new avcc(this.f92882c, this.f92886g);

    /* renamed from: l */
    private final bmzi f92917l;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqw.a(int, boolean):java.util.Set
     arg types: [int, int]
     candidates:
      sqw.a(java.lang.Object[], java.lang.Object[]):java.util.Map
      sqw.a(java.lang.Object, java.lang.Object):java.util.Set
      sqw.a(int, boolean):java.util.Set */
    public avbn(Context context, avdl avdl, ClientContext clientContext, String str, bmzi bmzi, UdcCacheRequest udcCacheRequest) {
        super(context, avdl, clientContext, str, "GetSettingsCacheOperation");
        Set set;
        this.f92917l = bmzi;
        int[] iArr = udcCacheRequest.f109349a;
        int length = iArr.length;
        if (length != 0) {
            set = sqw.m36036a(length, true);
        } else {
            set = new LinkedHashSet();
        }
        for (int i : iArr) {
            set.add(Integer.valueOf(i));
        }
        this.f92915b = set;
        this.f92888i = true;
    }

    /* renamed from: a */
    public static UdcCacheResponse.UdcSetting m78193a(int i, int i2, boolean z) {
        return new UdcCacheResponse.UdcSetting(i, i2, new UdcCacheResponse.SettingAvailability(z));
    }

    /* renamed from: a */
    public static void m78194a(AtomicBoolean atomicBoolean, boolean z) {
        if (chbh.f188248a.mo6606a().mo84935Q() && avet.m78390a(chbh.f188248a.mo6606a().mo84931M())) {
            ((beon) avet.m78388a().f93030c.mo6606a()).mo60861b(Boolean.valueOf(z));
            atomicBoolean.set(true);
        }
    }

    /* renamed from: a */
    private final void m78195a(boolean z, SparseArray sparseArray) {
        int a;
        avcb a2 = this.f92916k.mo51138a(z, this.f92915b);
        if (a2.f92942a.mo17710c()) {
            for (bxrq bxrq : a2.f92943b) {
                if (this.f92915b.contains(Integer.valueOf(bxrq.f164589b)) && (a = bxrp.m123042a(bxrq.f164590c)) != 0 && a == 2) {
                    avbm avbm = new avbm(bxrq);
                    sparseArray.put(avbm.f92913c, avbm);
                }
            }
            return;
        }
        bnsl bnsl = (bnsl) f92914a.mo68388c();
        bnsl.mo68432a("avbn", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Could not retrieve client-managed settings");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avbn.a(boolean, android.util.SparseArray):void
     arg types: [int, android.util.SparseArray]
     candidates:
      avbn.a(java.util.concurrent.atomic.AtomicBoolean, boolean):void
      avav.a(int, boolean):void
      avbn.a(boolean, android.util.SparseArray):void */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        super.mo6502a(context);
        mo51133b();
        if (!TextUtils.isEmpty(this.f92885f)) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            boolean z2 = true;
            if (avet.m78390a(chbh.f188248a.mo6606a().mo84934P())) {
                for (Integer num : this.f92915b) {
                    ((beon) avet.m78388a().f93031d.mo6606a()).mo60861b(Integer.valueOf(num.intValue()));
                }
                atomicBoolean.set(true);
            }
            SparseArray sparseArray = new SparseArray(this.f92915b.size());
            if (!chbh.m148008f() || !chbh.f188248a.mo6606a().mo84953m()) {
                auzj a = new avfg(avfv.m78451a(context).mo51196a(this.f92886g, bqgs.m112810a()), this.f92889j).mo51188a();
                if (a == null || (a.f92829a & 1) == 0) {
                    z = false;
                } else {
                    bxpe bxpe = a.f92830b;
                    if (bxpe == null) {
                        bxpe = bxpe.f164247d;
                    }
                    bxwc bxwc = bxpe.f164250b;
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        avbm avbm = new avbm((bxpd) bxwc.get(i));
                        sparseArray.put(avbm.f92913c, avbm);
                    }
                    z = true;
                }
                m78194a(atomicBoolean, z);
                m78195a(true, sparseArray);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Integer num2 : bnjd.m109586b((Iterable) avjl.f93272a.keySet().mo67639g(), avjk.f93271a)) {
                    int intValue = num2.intValue();
                    bqgg a2 = ((bdtq) this.f92917l.mo6606a()).mo58355a(bxoa.m122913a(intValue));
                    bqgg b = ((bdtq) this.f92917l.mo6606a()).mo58356b(bxoa.m122913a(intValue));
                    arrayList.add(bqga.m112786c(a2, b).mo69216a(new avbh(intValue, a2, b), bqfb.INSTANCE));
                }
                bqgg a3 = ((bdtq) this.f92917l.mo6606a()).mo58358a();
                arrayList.add(bqdx.m112673a(a3, avbi.f92907a, bqfb.INSTANCE));
                arrayList.add(bqdx.m112673a(a3, avbj.f92908a, bqfb.INSTANCE));
                for (avbm avbm2 : (List) avje.m78606a(bqdx.m112673a(bqdf.m112620a(bqfl.m112747c(bqga.m112774a((Iterable) arrayList)), Exception.class, new avbk(atomicBoolean), bqfb.INSTANCE), new avbl(atomicBoolean), bqfb.INSTANCE))) {
                    sparseArray.put(avbm2.f92913c, avbm2);
                }
                m78195a(false, sparseArray);
            }
            List a4 = sqw.m36032a(this.f92915b.size());
            List a5 = sqw.m36031a();
            Set a6 = avjj.m78611a();
            boolean z3 = false;
            for (Integer num3 : this.f92915b) {
                int intValue2 = num3.intValue();
                Integer valueOf = Integer.valueOf(intValue2);
                if (a6.contains(valueOf)) {
                    a4.add(m78193a(intValue2, 999, false));
                    z3 = true;
                } else {
                    avbm avbm3 = (avbm) sparseArray.get(intValue2);
                    if (avbm3 != null) {
                        a4.add(avbm3.f92911a);
                        if (avbm3.f92911a.f109355b != 2) {
                            if (avbm3.f92912b) {
                                a5.add(valueOf);
                            } else {
                                z3 = true;
                            }
                        }
                    } else {
                        a4.add(m78193a(intValue2, 999, false));
                        z3 = true;
                    }
                }
            }
            int[] a7 = sqc.m35960a(a5);
            if (z3 || this.f92915b.isEmpty()) {
                z2 = false;
            }
            UdcCacheResponse udcCacheResponse = new UdcCacheResponse(a4, a7, z2);
            if (atomicBoolean.get()) {
                long O = chbh.f188248a.mo6606a().mo84933O();
                if (O > 0) {
                    avet.m78389a(O, TimeUnit.MILLISECONDS);
                }
            }
            mo51131a(0);
            this.f92883d.mo51159a(Status.f30107a, udcCacheResponse);
            return;
        }
        throw new aaaj(5, null);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51159a(status, (UdcCacheResponse) null);
    }
}
