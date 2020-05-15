package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: syf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syf {

    /* renamed from: h */
    public static final /* synthetic */ int f45418h = 0;

    /* renamed from: a */
    public final Logger f45419a = tea.m36798a("verification_manager");

    /* renamed from: b */
    public final Context f45420b;

    /* renamed from: c */
    public final sza f45421c;

    /* renamed from: d */
    public final szd f45422d;

    /* renamed from: e */
    public final szr f45423e;

    /* renamed from: f */
    public final ConcurrentHashMap f45424f = new ConcurrentHashMap();

    /* renamed from: g */
    public final ConcurrentHashMap f45425g = new ConcurrentHashMap();

    /* renamed from: i */
    private final tev f45426i;

    /* renamed from: j */
    private final szd f45427j;

    /* renamed from: k */
    private final TelephonyManager f45428k;

    public syf(Context context) {
        sza sza = new sza(context);
        szd szd = new szd(context, "recent_get_consent_timestamps_in_seconds", cdfq.f180688a.mo6606a().mo77427b(), cdfq.f180688a.mo6606a().mo77428c());
        szd szd2 = new szd(context, "recent_sync_timestamps_in_seconds", cdfq.f180688a.mo6606a().mo77437l(), cdfq.f180688a.mo6606a().mo77438m());
        tev tev = new tev(sza);
        this.f45420b = context;
        this.f45421c = sza;
        this.f45426i = tev;
        this.f45422d = szd;
        this.f45427j = szd2;
        this.f45428k = (TelephonyManager) context.getSystemService("phone");
        this.f45423e = szr.m36692a();
    }

    /* renamed from: a */
    private static bngx m36576a(cbqy cbqy) {
        cbqn cbqn;
        cbqn cbqn2;
        if (cbqy != null) {
            cbqz cbqz = cbqy.f178085c;
            if (cbqz == null) {
                cbqz = cbqz.f178091c;
            }
            if (cbqz.f178093a == 1) {
                cbqn = (cbqn) cbqz.f178094b;
            } else {
                cbqn = cbqn.f178043d;
            }
            cbqp cbqp = cbqn.f178045a;
            if (cbqp == null) {
                cbqp = cbqp.f178048c;
            }
            if (cbqp.f178050a.size() != 0) {
                cbqz cbqz2 = cbqy.f178085c;
                if (cbqz2 == null) {
                    cbqz2 = cbqz.f178091c;
                }
                if (cbqz2.f178093a == 1) {
                    cbqn2 = (cbqn) cbqz2.f178094b;
                } else {
                    cbqn2 = cbqn.f178043d;
                }
                cbqp cbqp2 = cbqn2.f178045a;
                if (cbqp2 == null) {
                    cbqp2 = cbqp.f178048c;
                }
                return bngx.m109368a((Collection) cbqp2.f178050a);
            }
        }
        return bngx.m109376e();
    }

    /* renamed from: b */
    public static cbod m36578b() {
        cboc cboc = (cboc) cbod.f177801d.mo74144da();
        int v = (int) cdgc.f180745a.mo6606a().mo77500v();
        if (v == 1) {
            cboc.mo75239a(cbob.MT_SMS);
        } else if (v == 2) {
            cboc.mo75239a(cbob.MO_SMS);
        } else if (v == 3) {
            cboc.mo75239a(cbob.CARRIER_ID);
        } else if (v == 4) {
            cboc.mo75239a(cbob.FLASH_CALL);
        }
        return (cbod) cboc.mo74062i();
    }

    /* renamed from: c */
    private final teg m36580c(cbqy cbqy) {
        this.f45419a.mo25412b("Getting flash call receiver", new Object[0]);
        bnre i = m36576a(cbqy).listIterator();
        while (i.hasNext()) {
            String str = (String) i.next();
            if (this.f45425g.containsKey(str)) {
                return (teg) this.f45425g.get(str);
            }
        }
        return null;
    }

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    private final tes m36579b(cbqy cbqy) {
        bnre i = m36576a(cbqy).listIterator();
        while (i.hasNext()) {
            String str = (String) i.next();
            if (this.f45424f.containsKey(str)) {
                return (tes) this.f45424f.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List m36577a(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                bxvd da = cbqe.f178010c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbqe cbqe = (cbqe) da.f164949b;
                str.getClass();
                cbqe.f178012a = str;
                string.getClass();
                cbqe.f178013b = string;
                arrayList.add((cbqe) da.mo74062i());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0177 A[Catch:{ chuw | gid -> 0x0068, tdw -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0178 A[Catch:{ chuw | gid -> 0x0068, tdw -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a0 A[Catch:{ chuw | gid -> 0x0068, tdw -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c8 A[Catch:{ chuw | gid -> 0x0068, tdw -> 0x021e }] */
    /* renamed from: b */
    public final List mo26239b(tdx tdx, List list) {
        List list2;
        cbpt cbpt;
        bxyk bxyk;
        bqjd bqjd;
        cbpd cbpd;
        tdx tdx2 = tdx;
        this.f45427j.mo26263a();
        sza sza = this.f45421c;
        sza.f45464c.logVerbose("sync", new Object[0]);
        bxvd da = cbqu.f178071c.mo74144da();
        cbqj a = sza.mo26252a(tdx2, true, cdfq.m133005e(), "sync");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbqu cbqu = (cbqu) da.f164949b;
        a.getClass();
        cbqu.f178073a = a;
        if (!cbqu.f178074b.mo73666a()) {
            cbqu.f178074b = GeneratedMessageLite.m124021a(cbqu.f178074b);
        }
        bxsy.m123078a(list, cbqu.f178074b);
        cbqu cbqu2 = (cbqu) da.mo74062i();
        sza.f45464c.mo25412b("SyncRequest: %s", cbqu2);
        try {
            list2 = sza.mo26254a(tdx2, cbqu2);
        } catch (chuw | gid e) {
            chuv a2 = chuv.m149608a(e);
            tds tds = sza.f45467d;
            bqjd bqjd2 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd2.f164950c) {
                bqjd2.mo74035c();
                bqjd2.f164950c = false;
            }
            bqje bqje = (bqje) bqjd2.f164949b;
            bqje.f140935b = bqjw.m112936a(7);
            bqje.f140934a |= 1;
            tds.mo26413a(tdx2, e, (bqje) bqjd2.mo74062i(), (cbqy) null);
            if (a2.f189233s.equals(chus.UNAUTHENTICATED)) {
                sza.f45464c.mo25414c("Sync failed with unauthenticated error.", new Object[0]);
                if (((szc) szc.f45470a.get()) == null) {
                    szc.f45470a = new WeakReference(new szc());
                }
                chtr b = chuv.m149610b(e);
                if (b != null) {
                    cbpt = (cbpt) b.mo85652b(szc.f45472c);
                } else {
                    szc.f45471b.mo25412b("Get null trailers", new Object[0]);
                    cbpt = null;
                }
                if (cbpt == null) {
                    sza.f45464c.mo25412b("No phone device verification error.", new Object[0]);
                    bxyk = null;
                } else {
                    if (cbpt.f177957a == 1) {
                        cbpd = (cbpd) cbpt.f177958b;
                    } else {
                        cbpd = cbpd.f177902b;
                    }
                    bxyk bxyk2 = cbpd.f177904a;
                    if (bxyk2 == null) {
                        bxyk = bxyk.f165095c;
                    } else {
                        bxyk = bxyk2;
                    }
                }
                if (bxyk != null) {
                    cbqj a3 = sza.mo26251a(tdx, bxyk, true, cdfq.m133005e(), "sync");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a3.getClass();
                    ((cbqu) da.f164949b).f178073a = a3;
                } else {
                    szq a4 = szq.m36667a(sza.f45465a);
                    a4.mo26283a();
                    a4.mo26288b();
                    cbqj a5 = sza.mo26252a(tdx2, true, cdfq.m133005e(), "sync");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a5.getClass();
                    ((cbqu) da.f164949b).f178073a = a5;
                }
                try {
                    list2 = sza.mo26254a(tdx2, (cbqu) da.mo74062i());
                } catch (gid e2) {
                    e = e2;
                    bqjd = (bqjd) bqje.f140932h.mo74144da();
                    if (!bqjd.f164950c) {
                        bqjd.mo74035c();
                        bqjd.f164950c = false;
                    }
                    bqje bqje2 = (bqje) bqjd.f164949b;
                    bqje2.f140935b = bqjw.m112936a(7);
                    bqje2.f140934a |= 1;
                    sza.f45467d.mo26413a(tdx2, e, (bqje) bqjd.mo74062i(), (cbqy) null);
                    chuv a6 = chuv.m149608a(e);
                    if (!(e instanceof chuw)) {
                        chuw chuw = (chuw) e;
                        sza.f45464c.mo25417e("retry Sync failed with status: %s\nException: ", e, chuw.f189236a.toString());
                        throw new tdu("sync", bqjk.m112922b(chuw.f189236a.f189233s.f189211r), sza.m36627a(a6));
                    }
                    sza.f45464c.mo25417e("retry Sync failed with GoogleAuthException: ", e, new Object[0]);
                    throw new tdu("sync", 30, sza.m36627a(a6));
                } catch (chuw e3) {
                    e = e3;
                    bqjd = (bqjd) bqje.f140932h.mo74144da();
                    if (!bqjd.f164950c) {
                    }
                    bqje bqje22 = (bqje) bqjd.f164949b;
                    bqje22.f140935b = bqjw.m112936a(7);
                    bqje22.f140934a |= 1;
                    sza.f45467d.mo26413a(tdx2, e, (bqje) bqjd.mo74062i(), (cbqy) null);
                    chuv a62 = chuv.m149608a(e);
                    if (!(e instanceof chuw)) {
                    }
                }
            } else if (e instanceof chuw) {
                chuw chuw2 = (chuw) e;
                sza.f45464c.mo25417e("Sync failed with status: %s\nExcpetion: ", e, chuw2.f189236a.toString());
                throw new tdu("sync", bqjk.m112922b(chuw2.f189236a.f189233s.f189211r), sza.m36627a(a2));
            } else {
                sza.f45464c.mo25417e("Sync failed with GoogleAuthException: ", e, new Object[0]);
                throw new tdu("sync", 30, sza.m36627a(a2));
            }
        } catch (tdw e4) {
            new soa(10, new sye()).start();
            throw e4;
        }
        new soa(10, new syd()).start();
        return list2;
    }

    /* renamed from: a */
    public final HashMap mo26233a(List list) {
        cbqn cbqn;
        cbra cbra;
        cbqn cbqn2;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cbqy cbqy = (cbqy) it.next();
            Bundle bundle = new Bundle();
            bxwc bxwc = cbqy.f178088f;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                cbqe cbqe = (cbqe) bxwc.get(i);
                bundle.putString(cbqe.f178012a, cbqe.f178013b);
            }
            cbqz cbqz = cbqy.f178085c;
            if (cbqz == null) {
                cbqz = cbqz.f178091c;
            }
            if (cbqz.f178093a == 1) {
                cbqn = (cbqn) cbqz.f178094b;
            } else {
                cbqn = cbqn.f178043d;
            }
            if (cbqn.f178046b != null) {
                cbqz cbqz2 = cbqy.f178085c;
                if (cbqz2 == null) {
                    cbqz2 = cbqz.f178091c;
                }
                if (cbqz2.f178093a == 1) {
                    cbqn2 = (cbqn) cbqz2.f178094b;
                } else {
                    cbqn2 = cbqn.f178043d;
                }
                cbqq cbqq = cbqn2.f178046b;
                if (cbqq == null) {
                    cbqq = cbqq.f178052b;
                }
                int i2 = cbqq.f178054a;
                if (cdfw.m133049d() && i2 != -1) {
                    bundle.putString("sim_slot_index", String.valueOf(i2));
                }
            } else {
                this.f45419a.mo25414c("SIMSlot not found in server response", new Object[0]);
            }
            int b = cbqx.m128116b(cbqy.f178086d);
            if (b != 0 && b == 5 && cbqy.f178083a == 3 && !((cbra) cbqy.f178084b).f178097a.isEmpty()) {
                if (cbqy.f178083a == 3) {
                    cbra = (cbra) cbqy.f178084b;
                } else {
                    cbra = cbra.f178095c;
                }
                hashMap.put(cbra.f178097a, bundle);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r6v0, assign insn: 0x0022: CONST  (r6v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v3, assign insn: 0x0391: CONST  (r6v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v2, types: [boolean, int], assign insn: PHI: (r6v2 int) = (r6v0 ?), (r6v3 ?) binds: [B:8:0x0070, B:113:0x038b] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02e4  */
    /* renamed from: a */
    public final List mo26234a(tdx tdx, Bundle bundle, List list) {
        Map map;
        Map map2;
        cbre cbre;
        tes tes;
        cbqw cbqw;
        bxvd da;
        cboc cboc;
        bxvd da2;
        teg a;
        Map map3;
        Map map4;
        tdx tdx2 = tdx;
        new ArrayList();
        List a2 = m36577a(bundle);
        ArrayList arrayList = new ArrayList();
        Map b = tec.m36805a(this.f45420b, tdx2).mo26420b(tdx2, this.f45420b);
        ? r6 = 0;
        if (!list.isEmpty()) {
            Map a3 = tec.m36805a(this.f45420b, tdx2).mo26419a();
            Map a4 = tdg.m36749a().mo26395a(tdx2);
            ArrayList arrayList2 = new ArrayList();
            List list2 = tdx2.f45713f;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list2.get(i);
                bxvd da3 = cbpw.f177965b.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                str.getClass();
                ((cbpw) da3.f164949b).f177967a = str;
                arrayList2.add((cbpw) da3.mo74062i());
            }
            int size2 = list.size();
            int i2 = 0;
            while (i2 < size2) {
                Pair pair = (Pair) list.get(i2);
                if (pair.first != null) {
                    Logger Logger = this.f45419a;
                    String valueOf = String.valueOf((String) pair.first);
                    Logger.logVerbose(valueOf.length() == 0 ? new String("observed a imsi ") : "observed a imsi ".concat(valueOf), new Object[r6]);
                    String str2 = (String) pair.first;
                    String str3 = (String) pair.second;
                    cbqo cbqo = (cbqo) cbqp.f178048c.mo74144da();
                    cbqo.mo75242a(str2);
                    if (str3 != null) {
                        if (cbqo.f164950c) {
                            cbqo.mo74035c();
                            cbqo.f164950c = r6;
                        }
                        str3.getClass();
                        ((cbqp) cbqo.f164949b).f178051b = str3;
                    }
                    cbqm cbqm = (cbqm) cbqn.f178043d.mo74144da();
                    if (cbqm.f164950c) {
                        cbqm.mo74035c();
                        cbqm.f164950c = r6;
                    }
                    cbqp cbqp = (cbqp) cbqo.mo74062i();
                    cbqp.getClass();
                    ((cbqn) cbqm.f164949b).f178045a = cbqp;
                    cbqm.mo75241a(arrayList2);
                    if (b.containsKey(str2)) {
                        cbrh cbrh = (cbrh) b.get(str2);
                        bxvd bxvd = (bxvd) cbrh.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) cbrh);
                        cbre = (cbre) bxvd;
                    } else {
                        cbre = null;
                    }
                    if (a3 == null) {
                        map3 = b;
                        map4 = a3;
                    } else if (a3.containsKey(str2)) {
                        int intValue = ((Integer) a3.get(str2)).intValue();
                        if (!cdfw.m133049d()) {
                            bxvd da4 = cbqq.f178052b.mo74144da();
                            map2 = b;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            map = a3;
                            ((cbqq) da4.f164949b).f178054a = -1;
                            if (cbqm.f164950c) {
                                cbqm.mo74035c();
                                cbqm.f164950c = false;
                            }
                            cbqq cbqq = (cbqq) da4.mo74062i();
                            cbqq.getClass();
                            ((cbqn) cbqm.f164949b).f178046b = cbqq;
                        } else {
                            map2 = b;
                            map = a3;
                            int i3 = Build.VERSION.SDK_INT;
                            bxvd da5 = cbqq.f178052b.mo74144da();
                            int slotIndex = SubscriptionManager.getSlotIndex(intValue);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            ((cbqq) da5.f164949b).f178054a = slotIndex;
                            if (cbqm.f164950c) {
                                cbqm.mo74035c();
                                cbqm.f164950c = false;
                            }
                            cbqq cbqq2 = (cbqq) da5.mo74062i();
                            cbqq2.getClass();
                            ((cbqn) cbqm.f164949b).f178046b = cbqq2;
                        }
                        if (cbre != null && cdfn.m132939b()) {
                            if (cbre.f164950c) {
                                cbre.mo74035c();
                                cbre.f164950c = false;
                            }
                            cbrh cbrh2 = cbrh.f178114t;
                            ((cbrh) cbre.f164949b).f178131p = GeneratedMessageLite.m124030de();
                            cbre.mo75247b(szr.m36691a(intValue));
                        }
                        if (cbre != null && cdfn.m132940c()) {
                            if (cbre.f164950c) {
                                cbre.mo74035c();
                                cbre.f164950c = false;
                            }
                            cbrh cbrh3 = cbrh.f178114t;
                            ((cbrh) cbre.f164949b).f178134s = GeneratedMessageLite.m124030de();
                            cbre.mo75248c(szr.m36697b(intValue));
                        }
                        if (cbre != null) {
                            Integer valueOf2 = Integer.valueOf(intValue);
                            if (a4.containsKey(valueOf2)) {
                                if (cbre.f164950c) {
                                    cbre.mo74035c();
                                    cbre.f164950c = false;
                                }
                                cbrh cbrh4 = cbrh.f178114t;
                                ((cbrh) cbre.f164949b).f178133r = GeneratedMessageLite.m124030de();
                                cbre.mo75249d((Iterable) ((Pair) a4.get(valueOf2)).first);
                                if (cbre.f164950c) {
                                    cbre.mo74035c();
                                    cbre.f164950c = false;
                                }
                                ((cbrh) cbre.f164949b).f178132q = GeneratedMessageLite.m124030de();
                                cbre.mo75246a((Iterable) ((Pair) a4.get(valueOf2)).second);
                            }
                        }
                        tes = mo26237a(intValue, list.size());
                        this.f45424f.put(str2, tes);
                        int i4 = Build.VERSION.SDK_INT;
                        if (cdgc.m133123d() && (a = mo26236a(list.size())) != null) {
                            this.f45425g.put(str2, a);
                        }
                        cbqw = (cbqw) cbqy.f178081i.mo74144da();
                        if (cbre != null) {
                            if (cbqw.f164950c) {
                                cbqw.mo74035c();
                                cbqw.f164950c = false;
                            }
                            cbrh cbrh5 = (cbrh) cbre.mo74062i();
                            cbrh5.getClass();
                            ((cbqy) cbqw.f164949b).f178087e = cbrh5;
                        }
                        if (cbqw.f164950c) {
                            cbqw.mo74035c();
                            cbqw.f164950c = false;
                        }
                        ((cbqy) cbqw.f164949b).f178086d = cbqx.m128115a(3);
                        da = cbqz.f178091c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cbqz cbqz = (cbqz) da.f164949b;
                        cbqn cbqn = (cbqn) cbqm.mo74062i();
                        cbqn.getClass();
                        cbqz.f178094b = cbqn;
                        cbqz.f178093a = 1;
                        if (cbqw.f164950c) {
                            cbqw.mo74035c();
                            cbqw.f164950c = false;
                        }
                        cbqz cbqz2 = (cbqz) da.mo74062i();
                        cbqz2.getClass();
                        ((cbqy) cbqw.f164949b).f178085c = cbqz2;
                        cbqw.mo75244a(a2);
                        cbod b2 = m36578b();
                        bxvd bxvd2 = (bxvd) b2.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) b2);
                        cboc = (cboc) bxvd2;
                        da2 = cbon.f177839b.mo74144da();
                        String a5 = tes.mo26445a();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        a5.getClass();
                        ((cbon) da2.f164949b).f177841a = a5;
                        if (cboc.f164950c) {
                            cboc.mo74035c();
                            cboc.f164950c = false;
                        }
                        cbon cbon = (cbon) da2.mo74062i();
                        cbod cbod = cbod.f177801d;
                        cbon.getClass();
                        ((cbod) cboc.f164949b).f177804b = cbon;
                        if (cbqw.f164950c) {
                            cbqw.mo74035c();
                            cbqw.f164950c = false;
                        }
                        cbod cbod2 = (cbod) cboc.mo74062i();
                        cbod2.getClass();
                        ((cbqy) cbqw.f164949b).f178090h = cbod2;
                        arrayList.add((cbqy) cbqw.mo74062i());
                    } else {
                        map3 = b;
                        map4 = a3;
                    }
                    tes = new tep(this.f45420b);
                    bxvd da6 = cbqq.f178052b.mo74144da();
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    ((cbqq) da6.f164949b).f178054a = -1;
                    if (cbqm.f164950c) {
                        cbqm.mo74035c();
                        cbqm.f164950c = false;
                    }
                    cbqq cbqq3 = (cbqq) da6.mo74062i();
                    cbqq3.getClass();
                    ((cbqn) cbqm.f164949b).f178046b = cbqq3;
                    this.f45424f.put(str2, tes);
                    int i42 = Build.VERSION.SDK_INT;
                    this.f45425g.put(str2, a);
                    cbqw = (cbqw) cbqy.f178081i.mo74144da();
                    if (cbre != null) {
                    }
                    if (cbqw.f164950c) {
                    }
                    ((cbqy) cbqw.f164949b).f178086d = cbqx.m128115a(3);
                    da = cbqz.f178091c.mo74144da();
                    if (da.f164950c) {
                    }
                    cbqz cbqz3 = (cbqz) da.f164949b;
                    cbqn cbqn2 = (cbqn) cbqm.mo74062i();
                    cbqn2.getClass();
                    cbqz3.f178094b = cbqn2;
                    cbqz3.f178093a = 1;
                    if (cbqw.f164950c) {
                    }
                    cbqz cbqz22 = (cbqz) da.mo74062i();
                    cbqz22.getClass();
                    ((cbqy) cbqw.f164949b).f178085c = cbqz22;
                    cbqw.mo75244a(a2);
                    cbod b22 = m36578b();
                    bxvd bxvd22 = (bxvd) b22.mo74142c(5);
                    bxvd22.mo73625a((GeneratedMessageLite) b22);
                    cboc = (cboc) bxvd22;
                    da2 = cbon.f177839b.mo74144da();
                    String a52 = tes.mo26445a();
                    if (da2.f164950c) {
                    }
                    a52.getClass();
                    ((cbon) da2.f164949b).f177841a = a52;
                    if (cboc.f164950c) {
                    }
                    cbon cbon2 = (cbon) da2.mo74062i();
                    cbod cbod3 = cbod.f177801d;
                    cbon2.getClass();
                    ((cbod) cboc.f164949b).f177804b = cbon2;
                    if (cbqw.f164950c) {
                    }
                    cbod cbod22 = (cbod) cboc.mo74062i();
                    cbod22.getClass();
                    ((cbqy) cbqw.f164949b).f178090h = cbod22;
                    arrayList.add((cbqy) cbqw.mo74062i());
                } else {
                    map2 = b;
                    map = a3;
                }
                i2++;
                b = map2;
                a3 = map;
                r6 = 0;
            }
        }
        this.f45422d.mo26263a();
        sza sza = this.f45421c;
        if (sza.m36625a(a2, "one_time_verification").equals("True") || sza.mo26260a(tdx2, a2, cbnw.UNKNOWN_CLIENT)) {
            return mo26235a(tdx2, mo26239b(tdx2, arrayList));
        }
        this.f45419a.mo25414c("Device is not consented", new Object[0]);
        throw new tdt();
    }

    /* renamed from: a */
    public final List mo26235a(tdx tdx, List list) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        cbqg cbqg;
        teg teg;
        teg teg2;
        tdx tdx2 = tdx;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            str = "verification failed because imsi does not match original.";
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            cbqy cbqy = (cbqy) it.next();
            tdz.m36796a();
            if (tdz.m36797a(cbqy)) {
                tes b = m36579b(cbqy);
                if (b == null) {
                    this.f45419a.mo25418e(str, new Object[0]);
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (cdgc.m133123d()) {
                        teg2 = m36580c(cbqy);
                    } else {
                        teg2 = null;
                    }
                    teu a = this.f45426i.mo26451a(tdx2, cbqy, b, teg2);
                    a.mo26427a();
                    arrayList4.add(a);
                }
            } else {
                Logger Logger = this.f45419a;
                Object[] objArr = new Object[1];
                int b2 = cbqx.m128116b(cbqy.f178086d);
                if (b2 != 0) {
                    i = b2;
                }
                objArr[0] = Integer.valueOf(cbqx.m128115a(i));
                Logger.mo25414c("No challenge issued due to state: %s", objArr);
                arrayList3.add(cbqy);
            }
        }
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            teu teu = (teu) arrayList4.get(i3);
            cbqy b3 = teu.mo26428b();
            long s = cdgc.f180745a.mo6606a().mo77497s();
            cbqy cbqy2 = b3;
            int i4 = 0;
            teu teu2 = teu;
            while (true) {
                String str4 = str;
                if (((long) i4) < s) {
                    tdz.m36796a();
                    if (!tdz.m36797a(cbqy2)) {
                        str2 = str4;
                        arrayList = arrayList4;
                        break;
                    }
                    try {
                        String c = teu2.mo26429c();
                        if (cbqy2.f178083a == 4) {
                            cbqg = (cbqg) cbqy2.f178084b;
                        } else {
                            cbqg = cbqg.f178018b;
                        }
                        cbnz cbnz = cbqg.f178020a;
                        if (cbnz == null) {
                            cbnz = cbnz.f177781f;
                        }
                        cboa cboa = cbnz.f177785c;
                        if (cboa == null) {
                            cboa = cboa.f177788b;
                        }
                        if (c.equals(cboa.f177790a)) {
                            arrayList2 = arrayList4;
                        } else {
                            tes b4 = m36579b(cbqy2);
                            if (b4 != null) {
                                try {
                                    int i5 = Build.VERSION.SDK_INT;
                                    if (cdgc.m133123d()) {
                                        teg = m36580c(cbqy2);
                                    } else {
                                        teg = null;
                                    }
                                    arrayList2 = arrayList4;
                                    try {
                                        this.f45419a.mo25414c("Doing followup challenge", new Object[0]);
                                        teu2 = this.f45426i.mo26451a(tdx2, cbqy2, b4, teg);
                                    } catch (tdw e) {
                                        e = e;
                                        str3 = str4;
                                        this.f45419a.mo25417e("verification fails because of exception.", e, new Object[0]);
                                        i4++;
                                        str = str3;
                                        arrayList4 = arrayList2;
                                    }
                                } catch (tdw e2) {
                                    e = e2;
                                    arrayList2 = arrayList4;
                                    str3 = str4;
                                    this.f45419a.mo25417e("verification fails because of exception.", e, new Object[0]);
                                    i4++;
                                    str = str3;
                                    arrayList4 = arrayList2;
                                }
                                try {
                                    teu2.mo26427a();
                                } catch (tdw e3) {
                                    e = e3;
                                    str3 = str4;
                                    this.f45419a.mo25417e("verification fails because of exception.", e, new Object[0]);
                                    i4++;
                                    str = str3;
                                    arrayList4 = arrayList2;
                                }
                            } else {
                                arrayList2 = arrayList4;
                                str3 = str4;
                                try {
                                    this.f45419a.mo25418e(str3, new Object[0]);
                                } catch (tdw e4) {
                                    e = e4;
                                }
                                i4++;
                                str = str3;
                                arrayList4 = arrayList2;
                            }
                        }
                        this.f45419a.mo25414c("Doing verification for pending", new Object[0]);
                        str3 = str4;
                        cbqy2 = teu2.mo26430d();
                    } catch (tdw e5) {
                        e = e5;
                        str3 = str4;
                        arrayList2 = arrayList4;
                        this.f45419a.mo25417e("verification fails because of exception.", e, new Object[0]);
                        i4++;
                        str = str3;
                        arrayList4 = arrayList2;
                    }
                    i4++;
                    str = str3;
                    arrayList4 = arrayList2;
                } else {
                    str2 = str4;
                    arrayList = arrayList4;
                    break;
                }
            }
            Logger logger2 = this.f45419a;
            Object[] objArr2 = new Object[1];
            int b5 = cbqx.m128116b(cbqy2.f178086d);
            if (b5 == 0) {
                b5 = 1;
            }
            objArr2[0] = Integer.valueOf(cbqx.m128115a(b5));
            logger2.mo25414c("Final verification state: %s", objArr2);
            arrayList3.add(cbqy2);
            i3++;
            str = str2;
            arrayList4 = arrayList;
        }
        for (tes tes : this.f45424f.values()) {
            tes.mo26448b();
        }
        this.f45424f.clear();
        bngx e6 = szr.m36700e();
        szr.m36695a(arrayList3);
        bngx e7 = szr.m36700e();
        boolean containsAll = e6.containsAll(e7);
        boolean containsAll2 = e7.containsAll(e6);
        if (!containsAll || !containsAll2) {
            Intent intent = new Intent("com.google.android.gms.constellation.PHONE_NUMBER_CHANGE");
            if (!containsAll) {
                intent.addCategory("com.google.android.gms.constellation.PHONE_NUMBER_ADDED");
            }
            if (!containsAll2) {
                intent.addCategory("com.google.android.gms.constellation.PHONE_NUMBER_REMOVED");
            }
            this.f45420b.sendBroadcast(intent);
        }
        return arrayList3;
    }

    /* renamed from: a */
    public final teg mo26236a(int i) {
        if (cdgc.f180745a.mo6606a().mo77491m() && i > 1) {
            return null;
        }
        return new teg(this.f45428k);
    }

    /* renamed from: a */
    public final tes mo26237a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (!cdgc.f180745a.mo6606a().mo77494p()) {
            return new tep(this.f45420b, i);
        }
        if (!cdgc.f180745a.mo6606a().mo77495q() && i2 != 1) {
            return new tep(this.f45420b, i);
        }
        return new ter(i);
    }

    /* renamed from: a */
    public final void mo26238a() {
        if (!this.f45422d.mo26264b()) {
            this.f45419a.logVerbose("Throwing throttler exception for get consent", new Object[0]);
            throw new tdv("Throttled by getConsent RPC");
        } else if (!this.f45427j.mo26264b()) {
            this.f45419a.logVerbose("Throwing throttler exception for sync", new Object[0]);
            throw new tdv("Throttled by sync RPC");
        }
    }
}
