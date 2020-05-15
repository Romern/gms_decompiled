package com.google.android.gms.auth.api.phone.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SmsRetrieverCore$SmsAndTimeoutReceiver extends aacn {

    /* renamed from: a */
    private final sek f10264a = new sek("SmsAndTimeoutReceiver");

    public SmsRetrieverCore$SmsAndTimeoutReceiver() {
        super("auth_api_phone");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, hzp]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0327 A[Catch:{ all -> 0x0430, all -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0335 A[Catch:{ all -> 0x0430, all -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0421 A[Catch:{ all -> 0x0430, all -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0253 A[Catch:{ all -> 0x0430, all -> 0x0434 }] */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i;
        Class<hzv> cls;
        hzg hzg;
        bngx bngx;
        hyf hyf;
        int i2;
        bngx bngx2;
        String str;
        bngx bngx3;
        bnre bnre;
        bnre bnre2;
        boolean z = false;
        if (intent != null) {
            String action = intent.getAction();
            this.f10264a.mo25412b("onReceive: %s", action);
            if ("android.provider.Telephony.SMS_RECEIVED".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    i = extras.getInt("subscription", -1);
                } else {
                    i = -1;
                }
                int i3 = Build.VERSION.SDK_INT;
                SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
                bngx a = messagesFromIntent != null ? bngx.m109370a((Object[]) messagesFromIntent) : bngx.m109376e();
                if (!a.isEmpty()) {
                    Class<hzv> cls2 = hzv.class;
                    synchronized (cls2) {
                        try {
                            hzw a2 = hzv.m15096a(context);
                            hzm hzm = a2.f20612d;
                            long currentTimeMillis = System.currentTimeMillis();
                            hyb hyb = hzm.f20596c;
                            bmxy.m108581a(a);
                            hyb.mo12805a(currentTimeMillis);
                            int i4 = 2;
                            if (!hyb.f20546c.mo67314m()) {
                                if (!cceb.f178815a.mo6606a().mo75824h()) {
                                    if (a.size() == 1) {
                                        SmsMessage smsMessage = (SmsMessage) bnjd.m109587b(a);
                                        if (hyb.f20549f.mo12835a(smsMessage.getOriginatingAddress())) {
                                            str = smsMessage.getDisplayMessageBody();
                                        }
                                    }
                                    hzg = hzm.f20594a;
                                    hzg.mo12827a(currentTimeMillis);
                                    if (hzg.mo12828a()) {
                                        String a3 = ibi.m15196a(a);
                                        hzg.f20584a.mo25412b("received SMS message body: %s", a3);
                                        Iterator it = hzg.f20585b.iterator();
                                        while (it.hasNext()) {
                                            hzz hzz = (hzz) it.next();
                                            sek sek = hzg.f20584a;
                                            Object[] objArr = new Object[1];
                                            bngx bngx4 = a;
                                            cls = cls2;
                                            objArr[0] = Long.valueOf(hzz.f20618b);
                                            sek.mo25412b("timestamp: %d", objArr);
                                            hzr hzr = hzz.f20619c;
                                            if (TextUtils.isEmpty(a3)) {
                                                hyl.f20571a.mo25412b("The message body is an empty string, or null by a non text-based message.", new Object[0]);
                                                bngx2 = bngx4;
                                                cls2 = cls;
                                            } else {
                                                String trim = a3.trim();
                                                bnrd a4 = ((hyl) hzr).f20572b.iterator();
                                                while (a4.hasNext()) {
                                                    String str2 = (String) a4.next();
                                                    bnrd bnrd = a4;
                                                    hyl.f20571a.mo25412b("Message: %s, appCode: %s", trim, str2);
                                                    if (trim.contains(str2)) {
                                                        hyl.f20571a.mo25414c("Found a match", new Object[0]);
                                                        hzg.f20587d.mo12831a(ibh.m15173a(hzz.f20617a, currentTimeMillis - hzz.f20618b));
                                                        hzk hzk = hzg.f20587d;
                                                        String str3 = hzz.f20617a;
                                                        hzu hzu = hzk.f20592a.f20600g;
                                                        Intent a5 = hxw.m14998a(str3, Status.f30107a);
                                                        a5.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", a3);
                                                        if (i != -1) {
                                                            a5.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID", i);
                                                        }
                                                        hzu.mo12842a(a5);
                                                        it.remove();
                                                        a2.mo12843a();
                                                    }
                                                    a4 = bnrd;
                                                }
                                                bngx2 = bngx4;
                                                cls2 = cls;
                                            }
                                        }
                                        bngx = a;
                                        cls = cls2;
                                        hzg.f20584a.mo25414c("No matching message is found", new Object[0]);
                                    } else {
                                        bngx = a;
                                        cls = cls2;
                                    }
                                    hyf = hzm.f20595b;
                                    hyf.mo12806a(currentTimeMillis);
                                    if (!hyf.mo12808a()) {
                                        String a6 = ibi.m15196a(bngx);
                                        hyf.f20556a.mo25412b("received SMS message body: %s", a6);
                                        if (!hyf.f20557b.mo12829a(a6).isEmpty()) {
                                            hyf.f20556a.mo25414c("Found matched pattern.", new Object[0]);
                                            String originatingAddress = ((SmsMessage) bngx.get(0)).getOriginatingAddress();
                                            hzn hzn = new hzn();
                                            hzn.mo12836a(1);
                                            RequestResult requestResult = hzn.f20603a;
                                            requestResult.f10261b = a6;
                                            requestResult.f10262c = i;
                                            bngx e = bngx.m109376e();
                                            String a7 = hyf.m15007a(originatingAddress);
                                            if ("".equals(a7) || !hyf.f20558c.containsKey(a7)) {
                                                i2 = 0;
                                            } else {
                                                hyk hyk = (hyk) hyf.f20558c.get(a7);
                                                hyk.mo12813a(currentTimeMillis, requestResult);
                                                e = hyk.mo12812a(currentTimeMillis, bngx.m109376e());
                                                hyf.mo12807a(e, a7, currentTimeMillis);
                                                i2 = e.size();
                                            }
                                            hyk hyk2 = (hyk) hyf.f20558c.get("");
                                            sek sek2 = hyf.f20556a;
                                            String valueOf = String.valueOf(hyk2);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(originatingAddress).length());
                                            sb.append("generalQueue = ");
                                            sb.append(valueOf);
                                            sb.append(" real senderAddress = ");
                                            sb.append(originatingAddress);
                                            sek2.mo25412b(sb.toString(), new Object[0]);
                                            if (hyk2 != null && hyf.f20560e.mo12835a(originatingAddress)) {
                                                hyk2.mo12813a(currentTimeMillis, requestResult);
                                                bngx a8 = hyk2.mo12812a(currentTimeMillis, e);
                                                hyf.mo12807a(a8, "", currentTimeMillis);
                                                i2 += a8.size();
                                            }
                                            if (i2 > 0) {
                                                hyf.f20561f.mo12831a(ibh.m15170a(i2));
                                                hyf.f20562g.mo12839a(hyf.f20559d, hyf.m15009c());
                                                a2.mo12843a();
                                            }
                                        }
                                    }
                                    if (!z) {
                                        hzw.f20609a.mo25414c("No matching message is found", new Object[0]);
                                    }
                                    a2.mo12843a();
                                } else if (!a.isEmpty()) {
                                    if (hyb.f20549f.mo12835a(((SmsMessage) a.get(0)).getOriginatingAddress())) {
                                        str = ibi.m15196a(a);
                                    }
                                }
                                bngx a9 = hyb.f20547d.mo12829a(str);
                                if (!a9.isEmpty()) {
                                    String str4 = (String) bnjd.m109589b(a9, (Object) null);
                                    if (!TextUtils.isEmpty(str4)) {
                                        ((bnsl) hyb.f20544a.mo68390d()).mo68405a("found an sms code at new incoming messages");
                                        bnre i5 = bngx.m109368a((Collection) hyb.f20546c.mo67316o()).listIterator();
                                        while (i5.hasNext()) {
                                            String str5 = (String) i5.next();
                                            if (cceb.m129362f()) {
                                                bngx3 = bngx.m109368a((Collection) hyb.f20546c.mo67127c(str5));
                                            } else {
                                                bngx3 = bngx.m109356a(Long.valueOf(currentTimeMillis));
                                            }
                                            hyb.f20546c.mo67126b(str5);
                                            Context a10 = hyb.f20548e.mo12841a();
                                            if (a10 == null) {
                                                ((bnsl) hyb.f20544a.mo68388c()).mo68405a("Cannot borrow context. Ignore notifying sms code found.");
                                            } else if (!ibb.m15153a(a10, str5)) {
                                                bnre bnre3 = i5;
                                                if (!cceb.m129362f()) {
                                                    hyb.f20550g.mo12830a(ibh.m15168a(str5, 0, 10));
                                                } else {
                                                    bnre i6 = bngx3.listIterator();
                                                    while (i6.hasNext()) {
                                                        hyb.f20550g.mo12830a(ibh.m15168a(str5, currentTimeMillis - ((Long) i6.next()).longValue(), 10));
                                                    }
                                                }
                                                hyb.f20550g.mo12833a(str5, 36501);
                                                i5 = bnre3;
                                                i4 = 2;
                                            } else if (new iac(a10).mo12853a() != i4) {
                                                if (cceb.m129361e()) {
                                                    int i7 = 0;
                                                    while (i7 < bngx3.size()) {
                                                        bnre bnre4 = i5;
                                                        long longValue = currentTimeMillis - ((Long) bngx3.get(i7)).longValue();
                                                        if (i7 != 0) {
                                                            hyb.f20550g.mo12830a(ibh.m15184d(str5, longValue));
                                                            bnre2 = bnre4;
                                                        } else {
                                                            bnre2 = bnre4;
                                                            hyb.f20550g.mo12830a(ibh.m15168a(str5, longValue, 0));
                                                        }
                                                        i7++;
                                                        i5 = bnre2;
                                                    }
                                                    bnre = i5;
                                                } else if (cceb.m129362f()) {
                                                    bnre i8 = bngx3.listIterator();
                                                    while (i8.hasNext()) {
                                                        hyb.f20550g.mo12830a(ibh.m15168a(str5, currentTimeMillis - ((Long) i8.next()).longValue(), 0));
                                                    }
                                                    bnre = i5;
                                                } else {
                                                    hyb.f20550g.mo12830a(ibh.m15168a(str5, 0, 0));
                                                    bnre = i5;
                                                }
                                                hyb.f20550g.mo12834a(str5, str4);
                                                i5 = bnre;
                                                i4 = 2;
                                            } else {
                                                bnre bnre5 = i5;
                                                if (!cceb.m129362f()) {
                                                    hyb.f20550g.mo12830a(ibh.m15168a(str5, 0, 11));
                                                } else {
                                                    bnre i9 = bngx3.listIterator();
                                                    while (i9.hasNext()) {
                                                        hyb.f20550g.mo12830a(ibh.m15168a(str5, currentTimeMillis - ((Long) i9.next()).longValue(), 11));
                                                    }
                                                }
                                                hyb.f20550g.mo12833a(str5, 36502);
                                                i5 = bnre5;
                                                i4 = 2;
                                            }
                                        }
                                        z = true;
                                        hzg = hzm.f20594a;
                                        hzg.mo12827a(currentTimeMillis);
                                        if (hzg.mo12828a()) {
                                        }
                                        hyf = hzm.f20595b;
                                        hyf.mo12806a(currentTimeMillis);
                                        if (!hyf.mo12808a()) {
                                        }
                                        if (!z) {
                                        }
                                        a2.mo12843a();
                                    }
                                }
                                z = false;
                                hzg = hzm.f20594a;
                                hzg.mo12827a(currentTimeMillis);
                                if (hzg.mo12828a()) {
                                }
                                hyf = hzm.f20595b;
                                hyf.mo12806a(currentTimeMillis);
                                if (!hyf.mo12808a()) {
                                }
                                if (!z) {
                                }
                                a2.mo12843a();
                            }
                            z = false;
                            hzg = hzm.f20594a;
                            hzg.mo12827a(currentTimeMillis);
                            if (hzg.mo12828a()) {
                            }
                            hyf = hzm.f20595b;
                            hyf.mo12806a(currentTimeMillis);
                            if (!hyf.mo12808a()) {
                            }
                            if (!z) {
                            }
                            a2.mo12843a();
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
            } else if ("com.google.android.gms.auth.api.phone.action.ON_ALARM".equals(action)) {
                synchronized (hzv.class) {
                    hzw a11 = hzv.m15096a(context);
                    sek sek3 = hzw.f20609a;
                    hzm hzm2 = a11.f20612d;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    hzq hzq = hzm2.f20597d;
                    for (hzh hzh : hzq.f20605a.keySet()) {
                        ArrayList arrayList = (ArrayList) hzq.f20605a.get(hzh);
                        if (arrayList != null && bnjd.m109580a((Iterable) arrayList, (bmxz) new hzp(currentTimeMillis2))) {
                            hzh.mo12804a(currentTimeMillis2);
                        }
                    }
                    a11.mo12843a();
                }
            }
        } else {
            this.f10264a.mo25416d("received null intent", new Object[0]);
        }
    }
}
