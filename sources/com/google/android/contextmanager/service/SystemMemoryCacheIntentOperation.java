package com.google.android.contextmanager.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SystemMemoryCacheIntentOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x027b, code lost:
        if (r0.isEmpty() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02eb, code lost:
        if (r0.isEmpty() != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (r0.isEmpty() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0132, code lost:
        if (r0.isEmpty() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019c, code lost:
        if (r0.isEmpty() == false) goto L_0x00c5;
     */
    public final void onHandleIntent(Intent intent) {
        Collection collection;
        Set c;
        String action = intent.getAction();
        new Object[1][0] = action;
        if ("com.google.android.contextmanager.service.SystemMemoryCacheIntentOperation.INIT".equals(action)) {
            dtx dtx = dwq.m9648E().f13991b.f14002e;
            srn srn = dss.f13961a;
            dtx.f14019f.mo25065a();
            rsk rsk = dtx.f14019f;
            if (rsk == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dtx", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[FencePendingIntentCache]Could not initialize.  Cache is null.");
            } else if (!rsk.mo25065a()) {
                int b = rsk.m34336b(intent);
                int i = dtx.f14014a;
                if (b == 0) {
                    dtx.f14019f.mo25070c(intent);
                    HashSet<String> hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    try {
                        collection = null;
                        tjq a = dwq.m9673q().mo10053a((doh) null, 7);
                        if (a == null) {
                            c = dtx.mo9602c();
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
                            if (dtx.f14020g != null && (B || !c.isEmpty())) {
                                dwq.m9667k().mo9433a(dtx.f14020g);
                            }
                        } else {
                            tno tno = (tno) GeneratedMessageLite.m124016a(tno.f46307c, a.mo26593c(), bxus.m123744c());
                            if (tno == null) {
                                c = dtx.mo9602c();
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
                                if (dtx.f14020g != null && (B2 || !c.isEmpty())) {
                                    dwq.m9667k().mo9433a(dtx.f14020g);
                                }
                            } else {
                                if (tno.f46309a.isEmpty()) {
                                    if (tno.f46310b.isEmpty()) {
                                        c = dtx.mo9602c();
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
                                        if (dtx.f14020g != null && (B3 || !c.isEmpty())) {
                                            dwq.m9667k().mo9433a(dtx.f14020g);
                                        }
                                    }
                                }
                                HashMap hashMap = new HashMap();
                                for (tnp tnp : tno.f46309a) {
                                    dtt dtt = (dtt) hashMap.get(tnp.f46314b);
                                    if (dtt == null) {
                                        dtt = dtx.mo9599b(tnp.f46314b);
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
                                        dtt2 = dtx.mo9599b(tnq.f46325b);
                                        if (dtt2 != null) {
                                            hashMap.put(tnq.f46325b, dtt2);
                                        } else {
                                            hashSet.add(tnq.f46326c);
                                        }
                                    }
                                    dtt2.f14012d = tnq;
                                }
                                collection = hashMap.values();
                                c = dtx.mo9602c();
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
                                if (dtx.f14020g != null && (B4 || !c.isEmpty())) {
                                    dwq.m9667k().mo9433a(dtx.f14020g);
                                }
                            }
                        }
                    } catch (bxwf e) {
                        bnsl bnsl6 = (bnsl) dss.f13961a.mo68387b();
                        bnsl6.mo68437a(e);
                        bnsl6.mo68432a("dtx", "b", 440, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("[FencePendingIntentCache]Could not deserialize proto.");
                        c = dtx.mo9602c();
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
                        if (dtx.f14020g != null && (B5 || !c.isEmpty())) {
                            dwq.m9667k().mo9433a(dtx.f14020g);
                        }
                    } catch (Throwable th) {
                        Set c2 = dtx.mo9602c();
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
                        if (dtx.f14020g != null && (B6 || !c2.isEmpty())) {
                            dwq.m9667k().mo9433a(dtx.f14020g);
                        }
                        if (!c2.isEmpty()) {
                            dtx.mo9598a(c2);
                        }
                        throw th;
                    }
                    dtx.mo9598a(c);
                    egi egi = dtx.f14015b;
                    if (egi != null) {
                        egi.mo10086a((egg) new dtv(collection));
                    }
                    if (dtx.f14021h) {
                        dwq.m9667k().mo9435a(new dts(dtx), dqy.m9123a("delayedPersistCacheState"));
                    }
                }
            }
        } else {
            new Object[1][0] = action;
        }
    }
}
