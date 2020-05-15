package p000;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: amxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class amxj {

    /* renamed from: a */
    protected final amyr f76281a;

    /* renamed from: b */
    protected final amyp f76282b;

    /* renamed from: c */
    protected final anaz f76283c;

    /* renamed from: d */
    protected final amyf f76284d;

    /* renamed from: e */
    protected final amyk f76285e;

    /* renamed from: f */
    protected final bmxv f76286f;

    /* renamed from: g */
    protected final ammz f76287g;

    /* renamed from: h */
    protected final amwr f76288h;

    /* renamed from: i */
    private final amyq f76289i;

    /* renamed from: j */
    private final amvm f76290j;

    /* renamed from: k */
    private final amvt f76291k;

    protected amxj(ammz ammz, amyq amyq, amyr amyr, amyp amyp, anaz anaz, amvm amvm, amvt amvt, amwr amwr, amyf amyf, amyk amyk, bmxv bmxv) {
        this.f76287g = ammz;
        this.f76289i = amyq;
        this.f76281a = amyr;
        this.f76282b = amyp;
        this.f76283c = anaz;
        this.f76290j = amvm;
        this.f76291k = amvt;
        this.f76288h = amwr;
        this.f76284d = amyf;
        this.f76285e = amyk;
        this.f76286f = bmxv;
    }

    /* renamed from: a */
    private static alvf m63645a(ammz ammz) {
        ammz ammz2 = ammz.UNSPECIFIED;
        int ordinal = ammz.ordinal();
        if (ordinal == 1) {
            return alvf.INSERT;
        }
        if (ordinal == 2) {
            return alvf.UPDATE;
        }
        if (ordinal != 3) {
            return alvf.UNKNOWN_OPERATION;
        }
        return alvf.REMOVE;
    }

    /* renamed from: b */
    private final void m63649b(List list, chuw chuw) {
        m63646a(chuw, list);
        mo41538a(chuw, chuw.f189236a.f189233s.name(), list.size());
        amig.m62939a();
        if (!((Boolean) amfr.f74868a.mo41191a()).booleanValue() || chuw.f189236a.f189233s != chus.INVALID_ARGUMENT) {
            mo41535a(list.size());
        } else {
            int size = list.size();
            amig.m62939a();
            if (((Boolean) amgg.f74883a.mo41191a()).booleanValue()) {
                ((anbh) this.f76283c).f76541a.stats.numParseExceptions += (long) size;
            } else {
                ((anbh) this.f76283c).f76541a.stats.numParseExceptions++;
            }
        }
        m63647a(chuw);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo41542b((amvr) it.next());
        }
    }

    /* renamed from: c */
    private final void m63650c(amvr amvr) {
        bxvd bxvd;
        if (amvr.mo41411q() == null) {
            bxvd = alvh.f74376d.mo74144da();
        } else {
            bxvd = alvh.f74376d.mo74141a(amvr.mo41411q());
        }
        long longValue = amvr.mo41401h().longValue();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        alvh alvh = (alvh) bxvd.f164949b;
        alvh.f74378a |= 2;
        alvh.f74380c = longValue;
        amyr amyr = this.f76281a;
        Long g = amvr.mo41400g();
        amvu amvu = amyr.f76407a.f76139c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync1", Base64.encodeToString(((alvh) bxvd.mo74062i()).serializeToBytes(), 2));
        amig.m62939a();
        amvu.mo41455a(amvu.f76144a, g, contentValues, ((Boolean) amfl.f74862a.mo41191a()).booleanValue());
    }

    /* renamed from: e */
    private final void m63651e(List list) {
        if (!ancm.m64008a((Collection) list)) {
            try {
                m63648a(list, mo41541b(list));
            } catch (gid e) {
                int size = list.size();
                mo41538a(e, "GRPC_AUTH_EXCEPTION", size);
                amig.m62939a();
                if (((Boolean) amgg.f74883a.mo41191a()).booleanValue()) {
                    ((anbh) this.f76283c).f76541a.stats.numAuthExceptions += (long) size;
                } else {
                    ((anbh) this.f76283c).f76541a.stats.numAuthExceptions++;
                }
                m63647a(e);
            } catch (chuw e2) {
                mo41540a(list, e2);
            } catch (amxx e3) {
                int size2 = list.size();
                mo41538a(e3, String.valueOf(e3), size2);
                mo41535a(size2);
                m63647a(e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bmxv mo41534a(amvr amvr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41537a(amvr amvr, bzkv bzkv);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List mo41541b(List list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo41543c(List list);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo41544d(List list) {
        if (!list.isEmpty()) {
            this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 3, list.size());
        }
    }

    /* renamed from: a */
    protected static final void m63646a(chuw chuw, List list) {
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82916G()).booleanValue()) {
            new chuw(chuw.f189236a.mo85687a(list.toString()));
        }
    }

    /* renamed from: a */
    private final void m63647a(Exception exc) {
        Log.e("FSA2_BaseGroupUpSyncer", String.format("Group Sync gRPC throws Exception, operation type = %s", Integer.valueOf(this.f76287g.f75412e)), exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41542b(amvr amvr) {
        bxvd da = amni.f75479d.mo74144da();
        amng a = anax.m63874a(amvr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amni amni = (amni) da.f164949b;
        a.getClass();
        amni.f75482b = a;
        amni.f75481a |= 1;
        amig.m62939a();
        if (((Boolean) amfx.f74874a.mo41191a()).booleanValue()) {
            try {
                amnh a2 = this.f76285e.mo41564a(amvr.mo41400g().longValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amni amni2 = (amni) da.f164949b;
                a2.getClass();
                amni2.f75483c = a2;
                amni2.f75481a |= 2;
            } catch (RemoteException e) {
            }
        }
        this.f76283c.mo41637a((amni) da.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (java.lang.Boolean.valueOf(p000.cfvk.f185780a.mo6606a().mo82993bD()).booleanValue() == false) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0290 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028a A[Catch:{ RemoteException -> 0x0295 }, LOOP:1: B:75:0x0210->B:92:0x028a, LOOP_END] */
    /* renamed from: a */
    private final void m63648a(List list, List list2) {
        int i;
        amjt amjt;
        int i2 = 1;
        int i3 = 0;
        sdo.m34974b(list.size() == list2.size());
        amig.m62939a();
        int i4 = 0;
        while (i4 < list2.size()) {
            amvr amvr = (amvr) list.get(i4);
            bzkv bzkv = (bzkv) list2.get(i4);
            if (bzkv != null) {
                amyf amyf = this.f76284d;
                alvf a = m63645a(this.f76287g);
                int a2 = bzku.m125889a(bzkv.f170483f);
                if (a2 == 0) {
                    a2 = 2;
                }
                int a3 = amyd.m63709a(a, a2 - 1, bzkv.f170480c, amyf.f76368b);
                if (a3 == 2) {
                    this.f76281a.mo41572b(amvr.mo41400g());
                    this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 7, 1);
                } else if (a3 == 4 || a3 == 7) {
                    amyp amyp = this.f76282b;
                    Long g = amvr.mo41400g();
                    String l = amvr.mo41406l();
                    if (cfwy.f185865a.mo6606a().mo82850b()) {
                        l = l.trim();
                    }
                    try {
                        List a4 = amyp.f76397b.mo41568a(g, l);
                        if (a4.isEmpty()) {
                            Log.e("LocalGroupsMerger", "No synced duplicate group found in CP2 while server claims there is a duplicate");
                            if (cfwj.f185840a.mo6606a().mo82829a()) {
                                try {
                                    amyp.f76399d.mo41490b();
                                } catch (amyc e) {
                                    amjt = amjt.CLEAR_SYNC_TOKEN_FAILURE;
                                    i = a3;
                                }
                            }
                            amjt = amjt.NO_SYNCED_GROUP_WITH_SAME_TITLE;
                            i = a3;
                        } else {
                            if (a4.size() > i2) {
                                Log.e("LocalGroupsMerger", "More than 1 synced duplicate group found in CP2. Doesn't know which to merge with.");
                                if (!cfwj.f185840a.mo6606a().mo82831c()) {
                                    amjt = amjt.MULTIPLE_SYNCED_GROUPS_WITH_SAME_TITLE;
                                    i = a3;
                                }
                            }
                            amig.m62939a();
                            i = a3;
                            try {
                                int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82946aJ()).intValue();
                                while (true) {
                                    amym amym = amyp.f76398c;
                                    long longValue = g.longValue();
                                    long longValue2 = ((amvr) a4.get(i3)).mo41400g().longValue();
                                    amig.m62939a();
                                    int a5 = amym.mo41565a(longValue, longValue2, (long) Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83031h()).intValue());
                                    if (a5 >= 0) {
                                        try {
                                            amvu amvu = amyp.f76396a.f76141e;
                                            long longValue3 = g.longValue();
                                            ContentProviderOperation.Builder newAssertQuery = ContentProviderOperation.newAssertQuery(amvu.f76144a);
                                            String[] strArr = new String[i2];
                                            strArr[0] = String.valueOf(longValue3);
                                            try {
                                                amvu.f76145b.mo41496a(newAssertQuery.withSelection("mimetype='vnd.android.cursor.item/group_membership' AND data1=?", strArr).withExpectedCount(0), false);
                                                amyp.f76396a.f76139c.mo41461a(g, false);
                                                amyp.f76396a.mo41451b();
                                                amjt = amjt.SUCCESS;
                                                break;
                                            } catch (amyc e2) {
                                                e = e2;
                                            }
                                        } catch (amyc e3) {
                                            e = e3;
                                            try {
                                                Log.e("LocalGroupsMerger", "Failed to delete group.", e);
                                                int i5 = intValue - 1;
                                                if (intValue <= 0) {
                                                }
                                            } catch (RemoteException e4) {
                                                Log.e("LocalGroupsMerger", "Unable to merge the duplicate groups.");
                                                amjt = amjt.OTHER_REMOTE_EXCEPTION;
                                                if (cfvk.f185780a.mo6606a().mo82988az()) {
                                                }
                                                if (amjt != amjt.SUCCESS) {
                                                }
                                                i4++;
                                                i2 = 1;
                                                i3 = 0;
                                            }
                                        }
                                    } else {
                                        int i52 = intValue - 1;
                                        if (intValue <= 0) {
                                            intValue = i52;
                                            i2 = 1;
                                            i3 = 0;
                                        } else if (a5 >= 0) {
                                            amjt = amjt.DELETE_GROUP_FAILURE;
                                        } else if (a5 != -1) {
                                            amjt = amjt.OTHER_MOVE_CONTACTS_FAILURE;
                                        } else {
                                            amjt = amjt.TOO_MANY_CONTACTS;
                                        }
                                    }
                                }
                            } catch (RemoteException e5) {
                                Log.e("LocalGroupsMerger", "Unable to merge the duplicate groups.");
                                amjt = amjt.OTHER_REMOTE_EXCEPTION;
                                if (cfvk.f185780a.mo6606a().mo82988az()) {
                                }
                                if (amjt != amjt.SUCCESS) {
                                }
                                i4++;
                                i2 = 1;
                                i3 = 0;
                            }
                        }
                    } catch (RemoteException e6) {
                        i = a3;
                        Log.e("LocalGroupsMerger", "Unable to merge the duplicate groups.");
                        amjt = amjt.OTHER_REMOTE_EXCEPTION;
                        if (cfvk.f185780a.mo6606a().mo82988az()) {
                        }
                        if (amjt != amjt.SUCCESS) {
                        }
                        i4++;
                        i2 = 1;
                        i3 = 0;
                    }
                    if (cfvk.f185780a.mo6606a().mo82988az()) {
                        ((anbh) this.f76283c).f76565y = bmxv.m108566b(amjt);
                    }
                    if (amjt != amjt.SUCCESS) {
                        this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 3, 1);
                    } else if (i == 7) {
                        this.f76281a.mo41572b(amvr.mo41400g());
                        this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 7, 1);
                    }
                } else if (a3 == 5 && this.f76287g != ammz.INSERT) {
                    anan anan = new anan();
                    String j = amvr.mo41404j();
                    amig.m62939a();
                    try {
                        long parseLong = Long.parseLong(j, 16);
                        if (((Boolean) amfw.f74873a.mo41191a()).booleanValue()) {
                            if (anan.f76497a.contains(Long.valueOf(parseLong))) {
                                Object[] objArr = new Object[i2];
                                objArr[i3] = j;
                                amdk.m62658a("FSA2_GroupSourceIdValidator", "Group source ID %s is treated as invalid.", objArr);
                                amdk.m62656a("FSA2_BaseGroupUpSyncer", "Invalid group source ID is found: %s", amvr.mo41404j());
                                if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83045v()).booleanValue()) {
                                    try {
                                        if (!this.f76289i.mo41568a(amvr.mo41400g(), amvr.mo41406l()).isEmpty()) {
                                        }
                                    } catch (RemoteException e7) {
                                        mo41537a(amvr, bzkv);
                                        i4++;
                                        i2 = 1;
                                        i3 = 0;
                                    }
                                }
                                amdk.m62656a("FSA2_BaseGroupUpSyncer", "Start to nullify the invalid group source ID: %s", amvr.mo41404j());
                                amyr amyr = this.f76281a;
                                Long g2 = amvr.mo41400g();
                                amvu amvu2 = amyr.f76407a.f76139c;
                                ContentValues contentValues = new ContentValues();
                                contentValues.putNull("sourceid");
                                amig.m62939a();
                                amvu2.mo41455a(amvu2.f76144a, g2, contentValues, ((Boolean) amfl.f74862a.mo41191a()).booleanValue());
                                this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 3, 1);
                                ((anbh) this.f76283c).f76541a.stats.numIoExceptions++;
                            }
                        }
                    } catch (NumberFormatException e8) {
                        Object[] objArr2 = new Object[i2];
                        objArr2[i3] = j;
                        amdk.m62658a("FSA2_GroupSourceIdValidator", "Unable to parse groupSourceId, treat as invalid: %s", objArr2);
                    }
                } else if (cfxs.m143767b() && a3 == 8) {
                    if (amvr.mo41401h() != null) {
                        m63650c(amvr);
                    }
                }
                i4++;
                i2 = 1;
                i3 = 0;
            }
            try {
                mo41537a(amvr, bzkv);
            } catch (amxw e9) {
                mo41538a(e9, String.valueOf(e9.f76364a), 1);
                ((anbh) this.f76283c).f76541a.stats.numIoExceptions++;
            }
            i4++;
            i2 = 1;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41535a(int i) {
        amig.m62939a();
        if (((Boolean) amgg.f74883a.mo41191a()).booleanValue()) {
            ((anbh) this.f76283c).f76541a.stats.numIoExceptions += (long) i;
            return;
        }
        ((anbh) this.f76283c).f76541a.stats.numIoExceptions++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41536a(amvr amvr, amvr amvr2) {
        if (amvr != null) {
            this.f76281a.mo41570a(new anad(amvr, amvr2), false);
            this.f76281a.mo41571a(amvr2.mo41400g());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41538a(Exception exc, String str, int i) {
        this.f76283c.mo41632a(amjf.GROUP, this.f76287g, str, exc);
        this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 2, i);
    }

    /* renamed from: a */
    public final void mo41539a(List list) {
        List<amvr> list2;
        List list3 = list;
        this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 1, list.size());
        amig.m62939a();
        int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82990bA()).intValue();
        char c = 0;
        int i = 0;
        while (i < list.size()) {
            if (i == 0 && list.size() < intValue) {
                list2 = list3;
            } else {
                int i2 = i + intValue;
                if (list.size() > i2) {
                    list2 = list3.subList(i, i2);
                } else {
                    list2 = list3.subList(i, list.size());
                }
            }
            long a = this.f76283c.mo41629a();
            this.f76290j.mo41389a();
            if (!ancm.m64008a((Collection) list2)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (amvr amvr : list2) {
                    if (!TextUtils.isEmpty(amvr.mo41405k()) || "Starred in Android".equals(amvr.mo41406l())) {
                        arrayList.add(amvr);
                    } else {
                        arrayList2.add(amvr);
                    }
                }
                mo41543c(arrayList);
                if (cfxs.f186075a.mo6606a().mo83051a()) {
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        amvr amvr2 = (amvr) arrayList2.get(i3);
                        if (!cfxs.m143767b() || amvr2.mo41411q() == null || amvr2.mo41401h() == null || amvr2.mo41411q().f74380c != amvr2.mo41401h().longValue()) {
                            try {
                                bmxv a2 = mo41534a(amvr2);
                                if (a2.mo66813a()) {
                                    amvr[] amvrArr = new amvr[1];
                                    amvrArr[c] = amvr2;
                                    m63648a(Arrays.asList(amvrArr), Arrays.asList((bzkv) a2.mo66814b()));
                                } else {
                                    arrayList3.add(amvr2);
                                }
                            } catch (chuw e) {
                                mo41540a(Arrays.asList(amvr2), e);
                            }
                        } else {
                            ((anbh) this.f76283c).f76541a.stats.numParseExceptions++;
                            this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 8, 1);
                        }
                        i3++;
                        c = 0;
                    }
                    m63651e(arrayList3);
                } else {
                    m63651e(arrayList2);
                }
                this.f76291k.mo41451b();
            }
            int size2 = list2.size() - ((int) (this.f76283c.mo41629a() - a));
            amig.m62939a();
            if (this.f76286f.mo66813a() && ((Boolean) amgc.f74879a.mo41191a()).booleanValue() && (this.f76287g != ammz.REMOVE || ((Boolean) amgf.f74882a.mo41191a()).booleanValue())) {
                ((amxh) this.f76286f.mo66814b()).mo41524e(size2);
            }
            i += intValue;
            c = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41540a(List list, chuw chuw) {
        if (list.size() != 1) {
            m63649b(list, chuw);
            return;
        }
        amyf amyf = this.f76284d;
        alvf a = m63645a(this.f76287g);
        chuv chuv = chuw.f189236a;
        int a2 = amyf.mo41556a(a, chuv.f189233s.f189211r, chuv.f189234t);
        int i = a2 - 1;
        ammz ammz = ammz.UNSPECIFIED;
        if (a2 == 0) {
            throw null;
        } else if (i == 1) {
            this.f76281a.mo41572b(((amvr) list.get(0)).mo41400g());
            this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 3, 1);
        } else if (i != 7) {
            m63649b(list, chuw);
        } else {
            if (cfxs.m143767b()) {
                m63650c((amvr) list.get(0));
            }
            m63649b(list, chuw);
        }
    }
}
