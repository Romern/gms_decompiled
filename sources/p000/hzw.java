package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverCore$SmsAndTimeoutReceiver;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: hzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzw {

    /* renamed from: a */
    public static final sek f20609a = new sek("SmsRetrieverCore");

    /* renamed from: b */
    public final ibh f20610b = new ibh();

    /* renamed from: c */
    public final WeakReference f20611c;

    /* renamed from: d */
    public final hzm f20612d;

    /* renamed from: e */
    public int f20613e = 0;

    /* renamed from: f */
    private BroadcastReceiver f20614f;

    /* renamed from: g */
    private final hzu f20615g = new hzu(this);

    public hzw(Context context) {
        Context context2;
        this.f20611c = new WeakReference(context.getApplicationContext());
        this.f20612d = new hzm(this.f20615g);
        if (this.f20614f == null && (context2 = (Context) this.f20611c.get()) != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.addAction("com.google.android.gms.auth.api.phone.action.ON_ALARM");
            SmsRetrieverCore$SmsAndTimeoutReceiver smsRetrieverCore$SmsAndTimeoutReceiver = new SmsRetrieverCore$SmsAndTimeoutReceiver();
            this.f20614f = smsRetrieverCore$SmsAndTimeoutReceiver;
            context2.registerReceiver(smsRetrieverCore$SmsAndTimeoutReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public static RequestResult m15099a(Context context, String str, VerificationToken verificationToken) {
        RequestResult requestResult;
        synchronized (hzv.class) {
            hzw a = hzv.m15096a(context);
            WeakReference weakReference = a.f20612d.f20598e.f20552a;
            if (weakReference != null) {
                hye hye = (hye) weakReference.get();
                if (hye != null) {
                    hyk hyk = (hyk) hye.f20555a.f20558c.get(verificationToken.f10278b);
                    if (hyk != null) {
                        long j = verificationToken.f10277a;
                        bndu bndu = hyk.f20569d;
                        Long valueOf = Long.valueOf(j);
                        if (bndu.mo67271d(valueOf)) {
                            ListIterator listIterator = hyk.f20569d.mo67127c(valueOf).listIterator();
                            while (true) {
                                if (listIterator.hasNext()) {
                                    hyi hyi = (hyi) listIterator.next();
                                    if (str.equals(hyi.mo12794a())) {
                                        listIterator.remove();
                                        hzn hzn = new hzn(hyk.f20567b);
                                        long j2 = hyk.f20566a;
                                        long b = hyi.mo12795b();
                                        requestResult = hzn.f20603a;
                                        requestResult.f10263d = j2 - b;
                                        break;
                                    }
                                } else {
                                    hzn hzn2 = new hzn();
                                    hzn2.mo12836a(3);
                                    requestResult = hzn2.f20603a;
                                    break;
                                }
                            }
                        } else {
                            hzn hzn3 = new hzn();
                            hzn3.mo12836a(2);
                            requestResult = hzn3.f20603a;
                        }
                    } else {
                        hzn hzn4 = new hzn();
                        hzn4.mo12836a(2);
                        requestResult = hzn4.f20603a;
                    }
                    a.mo12843a();
                }
            }
            hzn hzn5 = new hzn();
            hzn5.mo12836a(2);
            requestResult = hzn5.f20603a;
            a.mo12843a();
        }
        return requestResult;
    }

    /* renamed from: b */
    public static boolean m15104b(Context context, String str) {
        bmxy.m108581a(str);
        if (hzv.m15097a()) {
            hzm hzm = hzv.m15096a(context).f20612d;
            bmxy.m108581a(str);
            hzg hzg = hzm.f20594a;
            bmxy.m108581a(str);
            ArrayList arrayList = hzg.f20585b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (bmwb.m108443a(str, ((hzz) arrayList.get(i)).f20617a)) {
                    return true;
                }
                i = i2;
            }
            hyf hyf = hzm.f20595b;
            bmxy.m108581a(str);
            for (hyk hyk : hyf.f20558c.values()) {
                bmxy.m108581a(str);
                if (hyk.f20568c.mo67271d(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m15100a(Context context, ConsentPromptUserResponse consentPromptUserResponse) {
        hye hye;
        synchronized (hzv.class) {
            hzw a = hzv.m15096a(context);
            hzm hzm = a.f20612d;
            long currentTimeMillis = System.currentTimeMillis();
            WeakReference weakReference = hzm.f20598e.f20552a;
            if (!(weakReference == null || (hye = (hye) weakReference.get()) == null)) {
                hye.f20555a.mo12809b(consentPromptUserResponse.f10259c).f20570e.put(consentPromptUserResponse.f10258b, new hxy(currentTimeMillis, consentPromptUserResponse.f10257a));
                hyf hyf = hye.f20555a;
                hyf.f20562g.mo12839a(hyf.f20559d, hyf.m15010d());
            }
            a.mo12843a();
        }
    }

    /* renamed from: a */
    public static void m15101a(Context context, hzz hzz) {
        synchronized (hzv.class) {
            f20609a.mo25412b("addLegacyRequest. TimeStamp: %d", Long.valueOf(hzz.f20618b));
            hzg hzg = hzv.m15096a(context).f20612d.f20594a;
            hzg.f20584a.mo25412b("addRequest. Timestamp: %d", Long.valueOf(hzz.f20618b));
            hzg.f20585b.add(hzz);
            hzg.f20588e.mo12839a(hzg.f20586c, ccdv.m129344b());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
     arg types: [bnic, java.lang.Class]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ibh.c(java.lang.String, long):ibf
     arg types: [java.lang.String, int]
     candidates:
      ibh.c(java.lang.String, int):ibf
      ibh.c(java.lang.String, long):ibf */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[Catch:{ all -> 0x00fa, all -> 0x0100 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x00e2=Splitter:B:31:0x00e2, B:36:0x00ec=Splitter:B:36:0x00ec} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00e8=Splitter:B:34:0x00e8, B:28:0x00dd=Splitter:B:28:0x00dd} */
    /* renamed from: a */
    public static void m15102a(Context context, String str) {
        Throwable th;
        String str2 = str;
        bmxy.m108581a(context);
        bmxy.m108581a(str);
        synchronized (hzv.class) {
            long currentTimeMillis = System.currentTimeMillis();
            sek sek = f20609a;
            Long valueOf = Long.valueOf(currentTimeMillis);
            sek.mo25412b("addAutofillRequest. Timestamp: %d", valueOf);
            hzm hzm = hzv.m15096a(context).f20612d;
            bmxy.m108581a(str);
            hyb hyb = hzm.f20596c;
            bmxy.m108581a(str);
            hyb.mo12805a(currentTimeMillis);
            Context a = hyb.f20548e.mo12841a();
            if (a != null) {
                hzk hzk = hyb.f20550g;
                Uri uri = hya.f20542a;
                srn srn = hyb.f20544a;
                StringBuilder sb = new StringBuilder(27);
                sb.append("date > ");
                sb.append(currentTimeMillis - (cceb.f178815a.mo6606a().mo75826j() * 1000));
                Cursor query = a.getContentResolver().query(hya.f20542a, (String[]) bnjd.m109584a((Iterable) hya.f20543b, String.class), sb.toString(), null, "date DESC");
                String str3 = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("date");
                            int columnIndex2 = query.getColumnIndex("address");
                            int columnIndex3 = query.getColumnIndex("body");
                            if (columnIndex >= 0) {
                                if (columnIndex2 >= 0 && columnIndex3 >= 0) {
                                    hzj hzj = new hzj();
                                    do {
                                        if (!ibc.m15159a(a, query.getString(columnIndex2))) {
                                            bngx a2 = hzj.mo12829a(query.getString(columnIndex3));
                                            if (!a2.isEmpty()) {
                                                String str4 = (String) bnjd.m109589b(a2, (Object) null);
                                                if (!TextUtils.isEmpty(str4)) {
                                                    if (cceb.m129362f() && !TextUtils.isEmpty(str4)) {
                                                        hzk.mo12830a(ibh.m15181c(str2, currentTimeMillis - query.getLong(columnIndex)));
                                                    }
                                                    query.close();
                                                    str3 = str4;
                                                    if (!TextUtils.isEmpty(str3)) {
                                                        ((bnsl) hyb.f20544a.mo68390d()).mo68405a("found an sms code at inbox");
                                                        if (!cceb.m129362f()) {
                                                            hyb.f20550g.mo12830a(ibh.m15181c(str2, 0L));
                                                        }
                                                        hyb.f20550g.mo12834a(str2, str3);
                                                    }
                                                }
                                            }
                                        }
                                    } while (query.moveToNext());
                                    query.close();
                                    if (!TextUtils.isEmpty(str3)) {
                                    }
                                }
                            }
                            ((bnsl) hyb.f20544a.mo68388c()).mo68405a("Date or address or body column does not exist.");
                            query.close();
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                }
                if (query != null) {
                    query.close();
                }
                if (!TextUtils.isEmpty(str3)) {
                }
            }
            hyb.f20546c.mo67268a(str2, valueOf);
            hyb.f20551h.mo12839a(hyb.f20545b, hyb.m15004a());
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public static void m15103a(Context context, String str, String str2) {
        bofz bofz;
        synchronized (hzv.class) {
            long currentTimeMillis = System.currentTimeMillis();
            sek sek = f20609a;
            Long valueOf = Long.valueOf(currentTimeMillis);
            int i = 0;
            sek.mo25412b("addConsentRequest. Timestamp: %d", valueOf);
            hyf hyf = hzv.m15096a(context).f20612d.f20595b;
            hyf.f20556a.mo25412b("addRequest. Timestamp: %d", valueOf);
            hyf.mo12806a(currentTimeMillis);
            String a = hyf.m15007a(str2);
            hyk b = hyf.mo12809b(a);
            b.f20568c.mo67268a(str, valueOf);
            hyf.f20562g.mo12839a(hyf.f20559d, hyf.m15008b());
            boolean z = !"".equals(a);
            hyj hyj = (hyj) b.f20570e.remove(str);
            if (hyj != null) {
                i = hyj.mo12800b();
            }
            if (i == 1) {
                bofz = bofz.CLICK_AGREE;
            } else if (i != 2) {
                bofz = bofz.UNKNOWN_ACTION;
            } else {
                bofz = bofz.CLICK_CANCEL;
            }
            hyf.f20561f.mo12831a(ibh.m15175a(str, z, bofz));
        }
    }

    /* renamed from: a */
    public final void mo12843a() {
        BroadcastReceiver broadcastReceiver;
        synchronized (hzv.class) {
            hzm hzm = this.f20612d;
            if (hzm.f20594a.mo12828a() && hzm.f20595b.mo12808a() && hzm.f20596c.f20546c.mo67314m()) {
                Context context = (Context) this.f20611c.get();
                if (!(context == null || (broadcastReceiver = this.f20614f) == null)) {
                    context.unregisterReceiver(broadcastReceiver);
                    this.f20614f = null;
                }
                hzv.m15098b();
            }
        }
    }
}
