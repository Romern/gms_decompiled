package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: dtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtx {

    /* renamed from: a */
    public final int f14014a = 0;

    /* renamed from: b */
    public final egi f14015b;

    /* renamed from: c */
    public final HashMap f14016c;

    /* renamed from: d */
    public final HashMap f14017d;

    /* renamed from: e */
    public final HashMap f14018e;

    /* renamed from: f */
    public final rsk f14019f;

    /* renamed from: g */
    public final Runnable f14020g;

    /* renamed from: h */
    public boolean f14021h = false;

    /* renamed from: i */
    private Set f14022i;

    /* renamed from: c */
    private final PendingIntent m9344c(String str) {
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "c", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not getExistingPendingIntent. pendingIntentKey=%s. Cache is null.", str);
            return null;
        }
        dtt dtt = (dtt) this.f14017d.get(str);
        if (dtt != null) {
            return dtt.f14009a;
        }
        List e = this.f14019f.mo25074e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            FencePendingIntentCache$FencePendingIntentItem fencePendingIntentCache$FencePendingIntentItem = (FencePendingIntentCache$FencePendingIntentItem) e.get(i);
            i++;
            if (TextUtils.equals(fencePendingIntentCache$FencePendingIntentItem.f7703a, str)) {
                return fencePendingIntentCache$FencePendingIntentItem.f7704b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo9592a() {
        srn srn = dss.f13961a;
        rsk rsk = this.f14019f;
        if (rsk == null || rsk.mo25065a()) {
            Collection<dtt> values = this.f14016c.values();
            bxvd da = tno.f46307c.mo74144da();
            if (!sqw.m36041a(values)) {
                for (dtt dtt : values) {
                    Collection a = dtt.mo9586a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    tno tno = (tno) da.f164949b;
                    if (!tno.f46309a.mo73666a()) {
                        tno.f46309a = bxvk.m124021a(tno.f46309a);
                    }
                    bxsy.m123078a(a, tno.f46309a);
                    tnq tnq = dtt.f14012d;
                    if (tnq != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        tno tno2 = (tno) da.f164949b;
                        tnq.getClass();
                        if (!tno2.f46310b.mo73666a()) {
                            tno2.f46310b = bxvk.m124021a(tno2.f46310b);
                        }
                        tno2.f46310b.add(tnq);
                    }
                }
            }
            dwq.m9673q().mo10051a(tjq.m37091a(7, (tno) da.mo74062i()));
            this.f14021h = false;
            return;
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("dtx", "a", 320, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("[FencePendingIntentCache]persistState called before cache is initialized.");
        this.f14021h = true;
    }

    /* renamed from: b */
    public final dtt mo9599b(String str) {
        PendingIntent pendingIntent;
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "c", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not getExistingPendingIntent. pendingIntentKey=%s. Cache is null.", str);
            pendingIntent = null;
        } else {
            dtt dtt = (dtt) this.f14017d.get(str);
            if (dtt == null) {
                List e = this.f14019f.mo25074e();
                int size = e.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pendingIntent = null;
                        break;
                    }
                    FencePendingIntentCache$FencePendingIntentItem fencePendingIntentCache$FencePendingIntentItem = (FencePendingIntentCache$FencePendingIntentItem) e.get(i);
                    i++;
                    if (TextUtils.equals(fencePendingIntentCache$FencePendingIntentItem.f7703a, str)) {
                        pendingIntent = fencePendingIntentCache$FencePendingIntentItem.f7704b;
                        break;
                    }
                }
            } else {
                pendingIntent = dtt.f14009a;
            }
        }
        if (pendingIntent != null) {
            return new dtt(pendingIntent, str);
        }
        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
        bnsl2.mo68432a("dtx", "b", 568, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("[FencePendingIntentCache]Expected to find a PendingIntent for pendingIntentKey=%s", str);
        return null;
    }

    public dtx(Context context, dtw dtw, dqb dqb) {
        if (dtw != null) {
            egi egi = new egi();
            this.f14015b = egi;
            egi.mo10088a(dtw, dqb);
        } else {
            this.f14015b = null;
        }
        this.f14016c = new HashMap();
        this.f14017d = new HashMap();
        this.f14018e = new HashMap();
        this.f14019f = rsk.m34333a(context, "com.google.android.contextmanager.service.ContextManagerService", 0, new dtu());
        long l = cdgp.f180782a.mo6606a().mo77592l();
        if (l > 0) {
            this.f14020g = new dtr(this);
            dwq.m9667k().mo9434a(this.f14020g, l, dqy.m9123a("RestartBroadcast"));
            return;
        }
        this.f14020g = null;
    }

    /* renamed from: c */
    public final Set mo9602c() {
        HashSet hashSet;
        String aT = cdgp.f180782a.mo6606a().mo77555aT();
        if (!TextUtils.isEmpty(aT)) {
            hashSet = new HashSet(Arrays.asList(aT.split(",")));
        } else {
            hashSet = new HashSet();
        }
        Set set = this.f14022i;
        if (set != null) {
            hashSet.removeAll(set);
        }
        return hashSet;
    }

    /* renamed from: b */
    public final String mo9600b(PendingIntent pendingIntent) {
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "b", 375, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not getExistingPendingIntentKey.  pendingIntent=%s. Cache is null.", pendingIntent);
            return null;
        }
        dtt dtt = (dtt) this.f14016c.get(pendingIntent);
        if (dtt != null) {
            return dtt.f14010b;
        }
        List e = this.f14019f.mo25074e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            FencePendingIntentCache$FencePendingIntentItem fencePendingIntentCache$FencePendingIntentItem = (FencePendingIntentCache$FencePendingIntentItem) e.get(i);
            i++;
            if (fencePendingIntentCache$FencePendingIntentItem.f7704b.equals(pendingIntent)) {
                return fencePendingIntentCache$FencePendingIntentItem.f7703a;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection mo9601b() {
        HashSet<String> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        try {
            tjq a = dwq.m9673q().mo10053a((doh) null, 7);
            if (a == null) {
                Set c = mo9602c();
                boolean B = cdgp.m133192B();
                if (B) {
                    hashSet2.removeAll(hashSet);
                    c.removeAll(hashSet2);
                } else {
                    c.retainAll(hashSet);
                    for (String str : hashSet) {
                        if (!c.contains(str)) {
                            bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                            bnsl.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68420a("[FencePendingIntentCache]%s not whitelisted", str);
                        }
                    }
                }
                if (this.f14020g != null && (B || !c.isEmpty())) {
                    dwq.m9667k().mo9433a(this.f14020g);
                }
                if (!c.isEmpty()) {
                    mo9598a(c);
                }
                return null;
            }
            tno tno = (tno) bxvk.m124016a(tno.f46307c, a.mo26593c(), bxus.m123744c());
            if (tno == null) {
                Set c2 = mo9602c();
                boolean B2 = cdgp.m133192B();
                if (B2) {
                    hashSet2.removeAll(hashSet);
                    c2.removeAll(hashSet2);
                } else {
                    c2.retainAll(hashSet);
                    for (String str2 : hashSet) {
                        if (!c2.contains(str2)) {
                            bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
                            bnsl2.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("[FencePendingIntentCache]%s not whitelisted", str2);
                        }
                    }
                }
                if (this.f14020g != null && (B2 || !c2.isEmpty())) {
                    dwq.m9667k().mo9433a(this.f14020g);
                }
                if (!c2.isEmpty()) {
                    mo9598a(c2);
                }
                return null;
            }
            if (tno.f46309a.isEmpty()) {
                if (tno.f46310b.isEmpty()) {
                    Set c3 = mo9602c();
                    boolean B3 = cdgp.m133192B();
                    if (B3) {
                        hashSet2.removeAll(hashSet);
                        c3.removeAll(hashSet2);
                    } else {
                        c3.retainAll(hashSet);
                        for (String str3 : hashSet) {
                            if (!c3.contains(str3)) {
                                bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                                bnsl3.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68420a("[FencePendingIntentCache]%s not whitelisted", str3);
                            }
                        }
                    }
                    if (this.f14020g != null && (B3 || !c3.isEmpty())) {
                        dwq.m9667k().mo9433a(this.f14020g);
                    }
                    if (!c3.isEmpty()) {
                        mo9598a(c3);
                    }
                    return null;
                }
            }
            HashMap hashMap = new HashMap();
            for (tnp tnp : tno.f46309a) {
                dtt dtt = (dtt) hashMap.get(tnp.f46314b);
                if (dtt == null) {
                    dtt = mo9599b(tnp.f46314b);
                    if (dtt != null) {
                        hashMap.put(tnp.f46314b, dtt);
                    } else {
                        hashSet.add(tnp.f46315c);
                    }
                }
                dtt.mo9587a(duu.m9452a(tnp.f46315c, tnp.f46316d, tnp.f46317e, tnp.f46318f), tnp);
                hashSet2.add(tnp.f46315c);
            }
            for (tnq tnq : tno.f46310b) {
                dtt dtt2 = (dtt) hashMap.get(tnq.f46325b);
                if (dtt2 == null) {
                    dtt2 = mo9599b(tnq.f46325b);
                    if (dtt2 != null) {
                        hashMap.put(tnq.f46325b, dtt2);
                    } else {
                        hashSet.add(tnq.f46326c);
                    }
                }
                dtt2.f14012d = tnq;
            }
            Collection values = hashMap.values();
            Set c4 = mo9602c();
            boolean B4 = cdgp.m133192B();
            if (B4) {
                hashSet2.removeAll(hashSet);
                c4.removeAll(hashSet2);
            } else {
                c4.retainAll(hashSet);
                for (String str4 : hashSet) {
                    if (!c4.contains(str4)) {
                        bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
                        bnsl4.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("[FencePendingIntentCache]%s not whitelisted", str4);
                    }
                }
            }
            if (this.f14020g != null && (B4 || !c4.isEmpty())) {
                dwq.m9667k().mo9433a(this.f14020g);
            }
            if (!c4.isEmpty()) {
                mo9598a(c4);
            }
            return values;
        } catch (bxwf e) {
            bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
            bnsl5.mo68437a(e);
            bnsl5.mo68432a("dtx", "b", 440, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("[FencePendingIntentCache]Could not deserialize proto.");
            Set c5 = mo9602c();
            boolean B5 = cdgp.m133192B();
            if (B5) {
                hashSet2.removeAll(hashSet);
                c5.removeAll(hashSet2);
            } else {
                c5.retainAll(hashSet);
                for (String str5 : hashSet) {
                    if (!c5.contains(str5)) {
                        bnsl bnsl6 = (bnsl) dss.f13961a.mo68390d();
                        bnsl6.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68420a("[FencePendingIntentCache]%s not whitelisted", str5);
                    }
                }
            }
            if (this.f14020g != null && (B5 || !c5.isEmpty())) {
                dwq.m9667k().mo9433a(this.f14020g);
            }
            if (!c5.isEmpty()) {
                mo9598a(c5);
            }
            return null;
        } catch (Throwable th) {
            Set c6 = mo9602c();
            boolean B6 = cdgp.m133192B();
            if (B6) {
                hashSet2.removeAll(hashSet);
                c6.removeAll(hashSet2);
            } else {
                c6.retainAll(hashSet);
                for (String str6 : hashSet) {
                    if (!c6.contains(str6)) {
                        bnsl bnsl7 = (bnsl) dss.f13961a.mo68390d();
                        bnsl7.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl7.mo68420a("[FencePendingIntentCache]%s not whitelisted", str6);
                    }
                }
            }
            if (this.f14020g != null && (B6 || !c6.isEmpty())) {
                dwq.m9667k().mo9433a(this.f14020g);
            }
            if (!c6.isEmpty()) {
                mo9598a(c6);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo9593a(PendingIntent pendingIntent) {
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "a", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not removeListener pendingIntent=%s. Cache is null.", pendingIntent);
            return;
        }
        dtt dtt = (dtt) this.f14016c.get(pendingIntent);
        if (dtt != null && dtt.f14012d != null) {
            dtt.f14012d = null;
            if (dtt.mo9589c()) {
                this.f14016c.remove(dtt.f14009a);
                this.f14017d.remove(dtt.f14010b);
                this.f14019f.mo25067b(new FencePendingIntentCache$FencePendingIntentItem(dtt.f14010b, dtt.f14009a));
                srn srn = dss.f13961a;
            }
        }
    }

    /* renamed from: a */
    public final void mo9594a(PendingIntent pendingIntent, ContextManagerClientInfo contextManagerClientInfo, tiw tiw) {
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "a", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not add data filter=%s. Cache is null.", tiw);
            return;
        }
        String b = mo9600b(pendingIntent);
        if (b == null) {
            b = UUID.randomUUID().toString();
            this.f14019f.mo25062a(new FencePendingIntentCache$FencePendingIntentItem(b, pendingIntent));
            srn srn = dss.f13961a;
        }
        dtt dtt = (dtt) this.f14016c.get(pendingIntent);
        if (dtt == null) {
            dtt = new dtt(pendingIntent, b);
            this.f14016c.put(pendingIntent, dtt);
            this.f14017d.put(b, dtt);
        }
        bxvd da = tnq.f46322h.mo74144da();
        if (b != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnq tnq = (tnq) da.f164949b;
            b.getClass();
            tnq.f46324a |= 1;
            tnq.f46325b = b;
        }
        String str = contextManagerClientInfo.f30678b;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnq tnq2 = (tnq) da.f164949b;
            str.getClass();
            tnq2.f46324a |= 2;
            tnq2.f46326c = str;
        }
        String str2 = contextManagerClientInfo.f30677a;
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnq tnq3 = (tnq) da.f164949b;
            str2.getClass();
            tnq3.f46324a |= 4;
            tnq3.f46327d = str2;
        }
        String str3 = contextManagerClientInfo.f30680d;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnq tnq4 = (tnq) da.f164949b;
            str3.getClass();
            tnq4.f46324a |= 8;
            tnq4.f46328e = str3;
        }
        if (tiw != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnq tnq5 = (tnq) da.f164949b;
            tiw.getClass();
            tnq5.f46329f = tiw;
            tnq5.f46324a |= 16;
        }
        dtt.f14012d = (tnq) da.mo74062i();
        srn srn2 = dss.f13961a;
    }

    /* renamed from: a */
    public final void mo9595a(PendingIntent pendingIntent, duu duu, boolean z) {
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not add registration=%s. Cache is null.", duu);
            return;
        }
        String b = mo9600b(pendingIntent);
        if (b == null) {
            b = UUID.randomUUID().toString();
            this.f14019f.mo25062a(new FencePendingIntentCache$FencePendingIntentItem(b, pendingIntent));
            srn srn = dss.f13961a;
        }
        dtt dtt = (dtt) this.f14016c.get(pendingIntent);
        if (dtt == null) {
            dtt = new dtt(pendingIntent, b);
            this.f14016c.put(pendingIntent, dtt);
            this.f14017d.put(b, dtt);
        }
        this.f14018e.put(duu.f14122e, dtt);
        bxvd da = tnp.f46311j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        tnp tnp = (tnp) da.f164949b;
        b.getClass();
        int i = tnp.f46313a | 1;
        tnp.f46313a = i;
        tnp.f46314b = b;
        String str = duu.f14123f;
        str.getClass();
        int i2 = i | 2;
        tnp.f46313a = i2;
        tnp.f46315c = str;
        String str2 = duu.f14124g;
        str2.getClass();
        int i3 = i2 | 4;
        tnp.f46313a = i3;
        tnp.f46316d = str2;
        String str3 = duu.f14125h;
        str3.getClass();
        int i4 = i3 | 8;
        tnp.f46313a = i4;
        tnp.f46317e = str3;
        String str4 = duu.f14118a;
        str4.getClass();
        int i5 = i4 | 16;
        tnp.f46313a = i5;
        tnp.f46318f = str4;
        bxcm bxcm = (bxcm) duu.f14119b.f14076c;
        bxcm.getClass();
        tnp.f46319g = bxcm;
        int i6 = i5 | 32;
        tnp.f46313a = i6;
        long j = duu.f14120c;
        int i7 = i6 | 64;
        tnp.f46313a = i7;
        tnp.f46320h = j;
        tnp.f46313a = i7 | 128;
        tnp.f46321i = z;
        dtt.mo9587a(duu.f14122e, (tnp) da.mo74062i());
        srn srn2 = dss.f13961a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0261, code lost:
        if (r0.isEmpty() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d1, code lost:
        if (r0.isEmpty() != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r0.isEmpty() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        if (r0.isEmpty() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0182, code lost:
        if (r0.isEmpty() == false) goto L_0x00ab;
     */
    /* renamed from: a */
    public final void mo9596a(Intent intent) {
        Collection collection;
        Set c;
        srn srn = dss.f13961a;
        this.f14019f.mo25065a();
        rsk rsk = this.f14019f;
        if (rsk == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FencePendingIntentCache]Could not initialize.  Cache is null.");
        } else if (!rsk.mo25065a() && rsk.m34336b(intent) == 0) {
            this.f14019f.mo25070c(intent);
            HashSet<String> hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            try {
                collection = null;
                tjq a = dwq.m9673q().mo10053a((doh) null, 7);
                if (a == null) {
                    c = mo9602c();
                    boolean B = cdgp.m133192B();
                    if (B) {
                        hashSet2.removeAll(hashSet);
                        c.removeAll(hashSet2);
                    } else {
                        c.retainAll(hashSet);
                        for (String str : hashSet) {
                            if (!c.contains(str)) {
                                bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
                                bnsl2.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("[FencePendingIntentCache]%s not whitelisted", str);
                            }
                        }
                    }
                    if (this.f14020g != null && (B || !c.isEmpty())) {
                        dwq.m9667k().mo9433a(this.f14020g);
                    }
                } else {
                    tno tno = (tno) bxvk.m124016a(tno.f46307c, a.mo26593c(), bxus.m123744c());
                    if (tno == null) {
                        c = mo9602c();
                        boolean B2 = cdgp.m133192B();
                        if (B2) {
                            hashSet2.removeAll(hashSet);
                            c.removeAll(hashSet2);
                        } else {
                            c.retainAll(hashSet);
                            for (String str2 : hashSet) {
                                if (!c.contains(str2)) {
                                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                                    bnsl3.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68420a("[FencePendingIntentCache]%s not whitelisted", str2);
                                }
                            }
                        }
                        if (this.f14020g != null && (B2 || !c.isEmpty())) {
                            dwq.m9667k().mo9433a(this.f14020g);
                        }
                    } else {
                        if (tno.f46309a.isEmpty()) {
                            if (tno.f46310b.isEmpty()) {
                                c = mo9602c();
                                boolean B3 = cdgp.m133192B();
                                if (B3) {
                                    hashSet2.removeAll(hashSet);
                                    c.removeAll(hashSet2);
                                } else {
                                    c.retainAll(hashSet);
                                    for (String str3 : hashSet) {
                                        if (!c.contains(str3)) {
                                            bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
                                            bnsl4.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68420a("[FencePendingIntentCache]%s not whitelisted", str3);
                                        }
                                    }
                                }
                                if (this.f14020g != null && (B3 || !c.isEmpty())) {
                                    dwq.m9667k().mo9433a(this.f14020g);
                                }
                            }
                        }
                        HashMap hashMap = new HashMap();
                        for (tnp tnp : tno.f46309a) {
                            dtt dtt = (dtt) hashMap.get(tnp.f46314b);
                            if (dtt == null) {
                                dtt = mo9599b(tnp.f46314b);
                                if (dtt != null) {
                                    hashMap.put(tnp.f46314b, dtt);
                                } else {
                                    hashSet.add(tnp.f46315c);
                                }
                            }
                            dtt.mo9587a(duu.m9452a(tnp.f46315c, tnp.f46316d, tnp.f46317e, tnp.f46318f), tnp);
                            hashSet2.add(tnp.f46315c);
                        }
                        for (tnq tnq : tno.f46310b) {
                            dtt dtt2 = (dtt) hashMap.get(tnq.f46325b);
                            if (dtt2 == null) {
                                dtt2 = mo9599b(tnq.f46325b);
                                if (dtt2 != null) {
                                    hashMap.put(tnq.f46325b, dtt2);
                                } else {
                                    hashSet.add(tnq.f46326c);
                                }
                            }
                            dtt2.f14012d = tnq;
                        }
                        collection = hashMap.values();
                        c = mo9602c();
                        boolean B4 = cdgp.m133192B();
                        if (B4) {
                            hashSet2.removeAll(hashSet);
                            c.removeAll(hashSet2);
                        } else {
                            c.retainAll(hashSet);
                            for (String str4 : hashSet) {
                                if (!c.contains(str4)) {
                                    bnsl bnsl5 = (bnsl) dss.f13961a.mo68390d();
                                    bnsl5.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl5.mo68420a("[FencePendingIntentCache]%s not whitelisted", str4);
                                }
                            }
                        }
                        if (this.f14020g != null && (B4 || !c.isEmpty())) {
                            dwq.m9667k().mo9433a(this.f14020g);
                        }
                    }
                }
            } catch (bxwf e) {
                bnsl bnsl6 = (bnsl) dss.f13961a.mo68387b();
                bnsl6.mo68437a(e);
                bnsl6.mo68432a("dtx", "b", 440, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("[FencePendingIntentCache]Could not deserialize proto.");
                c = mo9602c();
                boolean B5 = cdgp.m133192B();
                if (B5) {
                    hashSet2.removeAll(hashSet);
                    c.removeAll(hashSet2);
                } else {
                    c.retainAll(hashSet);
                    for (String str5 : hashSet) {
                        if (!c.contains(str5)) {
                            bnsl bnsl7 = (bnsl) dss.f13961a.mo68390d();
                            bnsl7.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68420a("[FencePendingIntentCache]%s not whitelisted", str5);
                        }
                    }
                }
                if (this.f14020g != null && (B5 || !c.isEmpty())) {
                    dwq.m9667k().mo9433a(this.f14020g);
                }
            } catch (Throwable th) {
                Set c2 = mo9602c();
                boolean B6 = cdgp.m133192B();
                if (B6) {
                    hashSet2.removeAll(hashSet);
                    c2.removeAll(hashSet2);
                } else {
                    c2.retainAll(hashSet);
                    for (String str6 : hashSet) {
                        if (!c2.contains(str6)) {
                            bnsl bnsl8 = (bnsl) dss.f13961a.mo68390d();
                            bnsl8.mo68432a("dtx", "b", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl8.mo68420a("[FencePendingIntentCache]%s not whitelisted", str6);
                        }
                    }
                }
                if (this.f14020g != null && (B6 || !c2.isEmpty())) {
                    dwq.m9667k().mo9433a(this.f14020g);
                }
                if (!c2.isEmpty()) {
                    mo9598a(c2);
                }
                throw th;
            }
            mo9598a(c);
            egi egi = this.f14015b;
            if (egi != null) {
                egi.mo10086a((egg) new dtv(collection));
            }
            if (this.f14021h) {
                dwq.m9667k().mo9435a(new dts(this), dqy.m9123a("delayedPersistCacheState"));
            }
        }
    }

    /* renamed from: a */
    public final void mo9597a(String str) {
        if (this.f14019f == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtx", "a", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Could not remove fenceKey=%s. Cache is null.", str);
            return;
        }
        dtt dtt = (dtt) this.f14018e.remove(str);
        if (dtt != null) {
            dtt.f14011c.remove(str);
            if (dtt.mo9589c()) {
                this.f14016c.remove(dtt.f14009a);
                this.f14017d.remove(dtt.f14010b);
                this.f14019f.mo25067b(new FencePendingIntentCache$FencePendingIntentItem(dtt.f14010b, dtt.f14009a));
                srn srn = dss.f13961a;
            }
        }
    }

    /* renamed from: a */
    public final void mo9598a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            dwq.m9662f().sendBroadcast(new Intent("com.google.com.android.gms.contextmanager.CONTEXT_MANAGER_RESTARTED").setPackage(str).setFlags(268435456));
            dwq.m9646C().mo10109c(dqy.m9123a("ContextManagerRestartedBroadcast"));
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dtx", "a", 546, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FencePendingIntentCache]Sending CONTEXT_MANAGER_RESTARTED broadcast to %s", str);
        }
        if (this.f14020g != null) {
            Set set2 = this.f14022i;
            if (set2 != null) {
                set2.addAll(set);
            } else {
                this.f14022i = set;
            }
        }
    }
}
