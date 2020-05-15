package p000;

import android.content.Context;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: aixs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixs {

    /* renamed from: a */
    public static final bnic f70014a = bnic.m109492a(bzbu.AUDIO_AUDIBLE_DTMF, bzbu.AUDIO_ULTRASOUND_PASSBAND, bzbu.BLUETOOTH_CLASSIC_NAME, bzbu.BLE_ADVERTISING_PACKET);

    /* renamed from: b */
    public final SparseArray f70015b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f70016c = new SparseArray();

    /* renamed from: d */
    public final Context f70017d;

    /* renamed from: e */
    public final buqh f70018e;

    /* renamed from: f */
    public final aiyz f70019f;

    /* renamed from: g */
    public final ajai f70020g;

    /* renamed from: h */
    public String f70021h;

    /* renamed from: i */
    private final ajat f70022i;

    public aixs(Context context) {
        this.f70017d = context;
        this.f70022i = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70018e = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70019f = (aiyz) ahgz.m55754a(context, aiyz.class);
        this.f70020g = (ajai) ahgz.m55754a(context, ajai.class);
    }

    /* renamed from: a */
    public static buyq m58128a(bzbu bzbu, ajgm ajgm) {
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 2) {
            bxvf bxvf = (bxvf) buyq.f155323f.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            buyq buyq = (buyq) bxvf.f164949b;
            buyq.f155326b = 2;
            buyq.f155325a |= 1;
            bxvd da = buzh.f155378c.mo74144da();
            bxvd da2 = buzi.f155382d.mo74144da();
            String str = ajgm.f70587b.f168983c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buzi buzi = (buzi) da2.f164949b;
            str.getClass();
            buzi.f155384a |= 1;
            buzi.f155385b = str;
            buzi buzi2 = (buzi) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzh buzh = (buzh) da.f164949b;
            buzi2.getClass();
            buzh.f155381b = buzi2;
            buzh.f155380a |= 1;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            buyq buyq2 = (buyq) bxvf.f164949b;
            buzh buzh2 = (buzh) da.mo74062i();
            buzh2.getClass();
            buyq2.f155328d = buzh2;
            buyq2.f155325a |= 4;
            bxvd da3 = buzq.f155418c.mo74144da();
            ByteString a = ByteString.m123261a(ajgm.f70586a.f67128a);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            buzq buzq = (buzq) da3.f164949b;
            a.getClass();
            buzq.f155420a |= 1;
            buzq.f155421b = a;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            buyq buyq3 = (buyq) bxvf.f164949b;
            buzq buzq2 = (buzq) da3.mo74062i();
            buzq2.getClass();
            buyq3.f155327c = buzq2;
            buyq3.f155325a |= 2;
            return (buyq) bxvf.mo74062i();
        } else if (ordinal == 3) {
            bxvf bxvf2 = (bxvf) buyq.f155323f.mo74144da();
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            buyq buyq4 = (buyq) bxvf2.f164949b;
            buyq4.f155326b = 3;
            buyq4.f155325a |= 1;
            buyx buyx = buyx.f155353d;
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            buyq buyq5 = (buyq) bxvf2.f164949b;
            buyx.getClass();
            buyq5.f155329e = buyx;
            buyq5.f155325a |= 8;
            bxvd da4 = buzq.f155418c.mo74144da();
            ByteString a2 = ByteString.m123261a(ajgm.f70586a.f67128a);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            buzq buzq3 = (buzq) da4.f164949b;
            a2.getClass();
            buzq3.f155420a |= 1;
            buzq3.f155421b = a2;
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            buyq buyq6 = (buyq) bxvf2.f164949b;
            buzq buzq4 = (buzq) da4.mo74062i();
            buzq4.getClass();
            buyq6.f155327c = buzq4;
            buyq6.f155325a |= 2;
            return (buyq) bxvf2.mo74062i();
        } else {
            String valueOf = String.valueOf(bzbu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Unsupported medium to advertise: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo38232b() {
        this.f70018e.mo72984b();
        buye a = mo38225a();
        if (a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "b", 438, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to stop background listening without NearbyDirect");
            return;
        }
        String str = this.f70021h;
        if (str != null) {
            a.mo73259a(str);
            this.f70021h = null;
        }
        this.f70020g.mo38392b();
    }

    /* renamed from: a */
    public static bvad m58129a(bzbu bzbu, byyo byyo) {
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 2) {
            bxvf bxvf = (bxvf) bvad.f155465e.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bvad bvad = (bvad) bxvf.f164949b;
            bvad.f155468b = 3;
            bvad.f155467a |= 1;
            bxvd da = buzj.f155387c.mo74144da();
            bxvd da2 = buzi.f155382d.mo74144da();
            String str = byyo.f168983c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buzi buzi = (buzi) da2.f164949b;
            str.getClass();
            int i = buzi.f155384a | 1;
            buzi.f155384a = i;
            buzi.f155385b = str;
            int i2 = byyo.f168982b;
            buzi.f155384a = i | 2;
            buzi.f155386c = i2;
            buzi buzi2 = (buzi) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzj buzj = (buzj) da.f164949b;
            buzi2.getClass();
            buzj.f155390b = buzi2;
            buzj.f155389a |= 1;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bvad bvad2 = (bvad) bxvf.f164949b;
            buzj buzj2 = (buzj) da.mo74062i();
            buzj2.getClass();
            bvad2.f155469c = buzj2;
            bvad2.f155467a |= 2;
            return (bvad) bxvf.mo74062i();
        } else if (ordinal != 3) {
            return null;
        } else {
            return m58130a((buyz[]) null);
        }
    }

    /* renamed from: a */
    public static bvad m58130a(buyz[] buyzArr) {
        int i;
        bxvf bxvf = (bxvf) bvad.f155465e.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvad bvad = (bvad) bxvf.f164949b;
        bvad.f155468b = 4;
        bvad.f155467a |= 1;
        bxvd da = buzb.f155365f.mo74144da();
        if (buyzArr == null) {
            i = 3;
        } else {
            i = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzb buzb = (buzb) da.f164949b;
        buzb.f155368b = i - 1;
        buzb.f155367a |= 1;
        buyv buyv = buyv.BLE_ADVERTISE_SCAN_RECORD;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzb buzb2 = (buzb) da.f164949b;
        buzb2.f155369c = buyv.f155342e;
        buzb2.f155367a = 2 | buzb2.f155367a;
        if (buyzArr != null) {
            List<buyz> asList = Arrays.asList(buyzArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzb buzb3 = (buzb) da.f164949b;
            if (!buzb3.f155370d.mo73666a()) {
                buzb3.f155370d = GeneratedMessageLite.m124019a(buzb3.f155370d);
            }
            for (buyz buyz : asList) {
                buzb3.f155370d.mo74153d(buyz.f155363d);
            }
        }
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvad bvad2 = (bvad) bxvf.f164949b;
        buzb buzb4 = (buzb) da.mo74062i();
        buzb4.getClass();
        bvad2.f155470d = buzb4;
        bvad2.f155467a |= 4;
        return (bvad) bxvf.mo74062i();
    }

    /* renamed from: a */
    private static byyo m58131a(Context context, bzbu bzbu) {
        ajat ajat = (ajat) ahgz.m55754a(context, ajat.class);
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 2) {
            byyd byyd = ajat.f70278f.f168928k;
            if (byyd == null) {
                byyd = byyd.f168903g;
            }
            byyo byyo = byyd.f168907c;
            return byyo == null ? byyo.f168979d : byyo;
        } else if (ordinal != 3) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68432a("aixs", "a", 685, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unsupported medium in Nearby.Direct: %s", bzbu);
            return null;
        } else {
            byyd byyd2 = ajat.f70278f.f168928k;
            if (byyd2 == null) {
                byyd2 = byyd.f168903g;
            }
            byyo byyo2 = byyd2.f168908d;
            return byyo2 == null ? byyo.f168979d : byyo2;
        }
    }

    /* renamed from: a */
    public static byzy m58132a(bzbu bzbu, ahfv ahfv) {
        byzx byzx = (byzx) byzy.f169191d.mo74144da();
        String a = ahfv.mo36407a();
        if (byzx.f164950c) {
            byzx.mo74035c();
            byzx.f164950c = false;
        }
        byzy byzy = (byzy) byzx.f164949b;
        a.getClass();
        byzy.f169193a |= 1;
        byzy.f169194b = a;
        bxvd da = byzz.f169196e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byzz byzz = (byzz) da.f164949b;
        byzz.f169199b = bzbu.f169275k;
        byzz.f169198a |= 1;
        byzx.mo74515a((byzz) da.mo74062i());
        return (byzy) byzx.mo74062i();
    }

    /* renamed from: a */
    public static Set m58133a(SparseArray sparseArray) {
        EnumSet noneOf = EnumSet.noneOf(bzbu.class);
        bnrd a = f70014a.iterator();
        while (a.hasNext()) {
            bzbu bzbu = (bzbu) a.next();
            if (sparseArray.get(bzbu.f169275k) != null) {
                noneOf.add(bzbu);
            }
        }
        return noneOf;
    }

    /* renamed from: a */
    private final void m58134a(ajgo ajgo, bzbu bzbu, ajgm ajgm) {
        this.f70018e.mo72984b();
        if (ajgo == null || !ajgo.mo38214a()) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s is not supported to advertise", ajgs.m58685a(bzbu));
            return;
        }
        this.f70015b.put(bzbu.f169275k, ajgo);
        try {
            srn srn = ahfq.f67120a;
            ajgm.f70586a.mo36407a();
            ajgs.m58685a(bzbu);
            ajgo.mo38217b(ajgm);
        } catch (ajgn e) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aixs", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Fail to start advertising: %s", ajgs.m58685a(bzbu));
        }
    }

    /* renamed from: a */
    private final void m58135a(ajgr ajgr, bzbu bzbu, aiyw aiyw, byyo byyo) {
        this.f70018e.mo72984b();
        if (ajgr == null || !ajgr.mo38220a()) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s is not supported to scan", ajgs.m58685a(bzbu));
            return;
        }
        this.f70016c.put(bzbu.f169275k, ajgr);
        try {
            srn srn = ahfq.f67120a;
            ajgs.m58685a(bzbu);
            ajgr.mo38219a(aiyw, byyo);
        } catch (ajgq e) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aixs", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Fail to start listening: %s", ajgs.m58685a(bzbu));
        }
    }

    /* renamed from: a */
    public static boolean m58136a(Context context, ajat ajat, int i) {
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int i2 = i - 1;
        if (i2 == 1) {
            byxy byxy = ajat.mo38427m().f168867f;
            if (byxy == null) {
                byxy = byxy.f168842f;
            }
            return byxy.f168845b;
        } else if (i2 == 2) {
            byxy byxy2 = ajat.mo38427m().f168867f;
            if (byxy2 == null) {
                byxy2 = byxy.f168842f;
            }
            return byxy2.f168846c;
        } else if (i2 == 4) {
            byxy byxy3 = ajat.mo38427m().f168867f;
            if (byxy3 == null) {
                byxy3 = byxy.f168842f;
            }
            return byxy3.f168848e;
        } else if (i2 == 103) {
            byxy byxy4 = ajat.mo38427m().f168867f;
            if (byxy4 == null) {
                byxy4 = byxy.f168842f;
            }
            return byxy4.f168847d;
        } else if (i2 != 106) {
            return false;
        } else {
            return ahfo.m55646a(context);
        }
    }

    /* renamed from: a */
    public static boolean m58137a(Context context, buye buye, bzbu bzbu) {
        byyo a;
        boolean z;
        if (!(buye == null || (a = m58131a(context, bzbu)) == null)) {
            ajat ajat = (ajat) ahgz.m55754a(context, ajat.class);
            bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
            bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = bzbu.ordinal();
            if (ordinal == 1) {
                z = ajat.mo38421g();
            } else if (ordinal == 2) {
                z = ajat.mo38424j();
            } else if (ordinal == 3) {
                z = ajat.mo38425k();
            } else if (ordinal == 8) {
                z = ajat.mo38423i();
            }
            if (!z || !buye.mo73260a(m58128a(bzbu, new ajgm(new ahfv(new byte[]{1, 2, 3}), a)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        if (r5.f168847d != false) goto L_0x006f;
     */
    /* renamed from: a */
    public static boolean m58138a(Context context, buye buye, bzbu bzbu, int i) {
        boolean z;
        byyo a = m58131a(context, bzbu);
        if (a != null) {
            ajat ajat = (ajat) ahgz.m55754a(context, ajat.class);
            bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
            bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = bzbu.ordinal();
            if (ordinal == 1) {
                z = ajat.mo38420f();
            } else if (ordinal == 2) {
                byyl byyl = ajat.f70278f.f168921d;
                if (byyl == null) {
                    byyl = byyl.f168949v;
                }
                z = byyl.f168955e;
            } else if (ordinal == 3) {
                byyl byyl2 = ajat.f70278f.f168921d;
                if (byyl2 == null) {
                    byyl2 = byyl.f168949v;
                }
                if (!byyl2.f168957g) {
                    byxy byxy = ajat.mo38427m().f168867f;
                    if (byxy == null) {
                        byxy = byxy.f168842f;
                    }
                    if (!byxy.f168845b) {
                        byxy byxy2 = ajat.mo38427m().f168867f;
                        if (byxy2 == null) {
                            byxy2 = byxy.f168842f;
                        }
                        if (!byxy2.f168846c) {
                            byxy byxy3 = ajat.mo38427m().f168867f;
                            if (byxy3 == null) {
                                byxy3 = byxy.f168842f;
                            }
                            if (!byxy3.f168848e) {
                                byxy byxy4 = ajat.mo38427m().f168867f;
                                if (byxy4 == null) {
                                    byxy4 = byxy.f168842f;
                                }
                            }
                        }
                    }
                }
                if (buye.mo73261a(m58130a(m58139a(i)))) {
                    return true;
                }
                return false;
            } else if (ordinal == 8) {
                z = ajat.mo38422h();
            }
            if (!z || !buye.mo73261a(m58129a(bzbu, a))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static buyz[] m58139a(int... iArr) {
        buyz buyz;
        int length = iArr.length;
        buyz[] buyzArr = new buyz[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (iArr[i] != 1) {
                buyz = buyz.BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS;
            } else {
                buyz = buyz.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON;
            }
            buyzArr[i2] = buyz;
            i++;
            i2 = i3;
        }
        return buyzArr;
    }

    /* renamed from: a */
    public final buye mo38225a() {
        return (buye) ahgz.m55755b(this.f70017d, buye.class);
    }

    /* renamed from: a */
    public final bvat mo38226a(bzbu bzbu, ajgp ajgp, aixj aixj) {
        return new aixk(this, aixj, ajgp, bzbu);
    }

    /* renamed from: a */
    public final Set mo38227a(Set set) {
        HashSet hashSet;
        if (set != null) {
            hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                BleFilter bleFilter = (BleFilter) it.next();
                neh neh = new neh();
                ParcelUuid parcelUuid = bleFilter.f80699b;
                ParcelUuid parcelUuid2 = bleFilter.f80700c;
                if (parcelUuid2 != null && parcelUuid == null) {
                    throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
                }
                neh.f35389a = parcelUuid;
                neh.f35390b = parcelUuid2;
                ParcelUuid parcelUuid3 = bleFilter.f80701d;
                if (parcelUuid3 != null) {
                    neh.mo20519a(parcelUuid3, bleFilter.f80702e, bleFilter.f80703f);
                }
                byte[] bArr = bleFilter.f80705h;
                if (bArr != null || bleFilter.f80704g > 0) {
                    int i = bleFilter.f80704g;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    neh.mo20516a(i, bArr, bleFilter.f80706i);
                }
                hashSet.add(neh.mo20515a());
            }
        } else {
            hashSet = new HashSet();
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add(aiyu.f70105a);
        nfa nfa = new nfa();
        if (m58136a(this.f70017d, this.f70022i, 2)) {
            nfa.mo20563h();
        }
        if (cfop.m141875e()) {
            if (m58136a(this.f70017d, this.f70022i, 5)) {
                nfa.f35445c = true;
            }
            if (m58136a(this.f70017d, this.f70022i, (int) ErrorInfo.TYPE_SDU_FAILED)) {
                nfa.f35444b = true;
            }
            if (m58136a(this.f70017d, this.f70022i, 3)) {
                nfa.f35443a = true;
            }
        } else if (m58136a(this.f70017d, this.f70022i, 5) || m58136a(this.f70017d, this.f70022i, (int) ErrorInfo.TYPE_SDU_FAILED) || m58136a(this.f70017d, this.f70022i, 3)) {
            nfa.mo20562g();
        }
        hashSet2.addAll(nfa.mo20561a());
        if (m58136a(this.f70017d, this.f70022i, 107)) {
            hashSet2.add(ahfo.f67118b);
        }
        return rsr.m34360a(hashSet, hashSet2);
    }

    /* renamed from: a */
    public final void mo38228a(ajgp ajgp, int[] iArr, Set set) {
        this.f70018e.mo72984b();
        buye a = mo38225a();
        if (a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start background listening without NearbyDirect");
            return;
        }
        Set a2 = mo38227a(set);
        String str = this.f70021h;
        if (str != null) {
            srn srn = ahfq.f67120a;
        } else {
            str = null;
        }
        buyz[] a3 = m58139a(iArr);
        srn srn2 = ahfq.f67120a;
        this.f70021h = a.mo73255a(m58130a(a3), mo38226a(bzbu.BLE_ADVERTISING_PACKET, ajgp, new aixj(this)), ajgw.m58695a(this.f70017d), a2).f155451b;
        if (str != null) {
            a.mo73259a(str);
        }
    }

    /* renamed from: a */
    public final void mo38229a(bzbu bzbu) {
        this.f70018e.mo72984b();
        ajgo ajgo = (ajgo) this.f70015b.get(bzbu.f169275k);
        if (ajgo != null) {
            ajgo.mo38216b();
            this.f70015b.remove(bzbu.f169275k);
            srn srn = ahfq.f67120a;
            ajgs.m58685a(bzbu);
            ajgs.m58686a(m58133a(this.f70015b));
            return;
        }
        srn srn2 = ahfq.f67120a;
    }

    /* renamed from: a */
    public final void mo38230a(bzbu bzbu, aiyw aiyw, byyo byyo, Set set) {
        ajgr ajgr;
        this.f70018e.mo72984b();
        if (((ajgr) this.f70016c.get(bzbu.f169275k)) != null) {
            srn srn = ahfq.f67120a;
            return;
        }
        buye a = mo38225a();
        if (a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start listening without live NearbyDirect");
            return;
        }
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 1) {
            ajgr = this.f70019f.f70128d;
        } else if (ordinal == 2 || ordinal == 3) {
            ajgr = new aixo(this, this.f70017d, a, bzbu, set);
        } else if (ordinal != 8) {
            String a2 = ajgs.m58685a(bzbu);
            throw new IllegalStateException(a2.length() == 0 ? new String("Unknown Medium requested: ") : "Unknown Medium requested: ".concat(a2));
        } else {
            ajgr = this.f70019f.f70126b;
        }
        if (ajgr.mo38220a()) {
            this.f70018e.mo72984b();
            if (!ajgr.mo38220a()) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68432a("aixs", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s is not supported to scan", ajgs.m58685a(bzbu));
                return;
            }
            this.f70016c.put(bzbu.f169275k, ajgr);
            try {
                srn srn2 = ahfq.f67120a;
                ajgs.m58685a(bzbu);
                ajgr.mo38219a(aiyw, byyo);
            } catch (ajgq e) {
                bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aixs", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Fail to start listening: %s", ajgs.m58685a(bzbu));
            }
        } else {
            srn srn3 = ahfq.f67120a;
            ajgs.m58685a(bzbu);
            ajgr.mo38220a();
        }
    }

    /* renamed from: a */
    public final void mo38231a(bzbu bzbu, ajgm ajgm, Runnable runnable) {
        ajgo ajgo;
        this.f70018e.mo72984b();
        ajgo ajgo2 = (ajgo) this.f70015b.get(bzbu.f169275k);
        if (ajgo2 != null) {
            if (ajgo2.mo38215a(ajgm)) {
                srn srn = ahfq.f67120a;
                ajgm.mo38614a();
                ajgs.m58685a(bzbu);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            mo38229a(bzbu);
        }
        buye a = mo38225a();
        if (a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start advertising without live NearbyDirect");
            return;
        }
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 1) {
            ajgo = this.f70019f.f70127c;
        } else if (ordinal == 2 || ordinal == 3) {
            ajgo = new aixn(this, this.f70017d, a, bzbu, runnable);
        } else if (ordinal != 8) {
            String a2 = ajgs.m58685a(bzbu);
            throw new IllegalStateException(a2.length() == 0 ? new String("Unknown Medium requested: ") : "Unknown Medium requested: ".concat(a2));
        } else {
            ajgo = this.f70019f.f70125a;
        }
        if (ajgo.mo38214a()) {
            this.f70018e.mo72984b();
            if (!ajgo.mo38214a()) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68432a("aixs", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s is not supported to advertise", ajgs.m58685a(bzbu));
            } else {
                this.f70015b.put(bzbu.f169275k, ajgo);
                try {
                    srn srn2 = ahfq.f67120a;
                    ajgm.f70586a.mo36407a();
                    ajgs.m58685a(bzbu);
                    ajgo.mo38217b(ajgm);
                } catch (ajgn e) {
                    bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68432a("aixs", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Fail to start advertising: %s", ajgs.m58685a(bzbu));
                }
            }
            if ((bzbu == bzbu.AUDIO_ULTRASOUND_PASSBAND || bzbu == bzbu.AUDIO_AUDIBLE_DTMF) && runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        srn srn3 = ahfq.f67120a;
        String a3 = ajgs.m58685a(bzbu);
        String valueOf = String.valueOf(ajgo);
        String valueOf2 = String.valueOf(Boolean.valueOf(ajgo.mo38214a()));
        StringBuilder sb = new StringBuilder(a3.length() + 29 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(a3);
        sb.append(" advertiser: ");
        sb.append(valueOf);
        sb.append(" can advertise: ");
        sb.append(valueOf2);
        sb.toString();
    }
}
