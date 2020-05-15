package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.gms.internal.SmsCodeAutoRetriever;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: brli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brli implements Handler.Callback {

    /* renamed from: a */
    public static final Logger f142910a = new Logger("FirebaseAuth", "PhoneVerificationSession");

    /* renamed from: b */
    public final snr f142911b;

    /* renamed from: c */
    public final sns f142912c;

    /* renamed from: d */
    public final List f142913d = new ArrayList();

    /* renamed from: e */
    final boolean f142914e;

    /* renamed from: f */
    public boolean f142915f = true;

    /* renamed from: g */
    SmsCodeAutoRetriever f142916g;

    /* renamed from: h */
    int f142917h = 1;

    /* renamed from: i */
    String f142918i;

    /* renamed from: j */
    String f142919j;

    /* renamed from: k */
    public String f142920k;

    /* renamed from: l */
    private final List f142921l = new ArrayList();

    /* renamed from: m */
    private final brpy f142922m;

    /* renamed from: n */
    private final String f142923n;

    /* renamed from: o */
    private boolean f142924o;

    public brli(brpy brpy, String str, boolean z, sns sns) {
        f142910a.mo25416d("PhoneVerificationSession constructor", new Object[0]);
        this.f142922m = brpy;
        this.f142923n = str;
        this.f142914e = z;
        this.f142912c = sns;
        this.f142911b = new snr(this.f142912c, this);
        this.f142918i = "";
    }

    /* renamed from: a */
    public static final void m114129a(List list, brlg brlg, Object... objArr) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            brpj brpj = (brpj) ((WeakReference) list.get(i)).get();
            if (brpj != null) {
                brlg.mo69679a(brpj, objArr);
            }
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo69683a() {
        return this.f142917h != 5;
    }

    /* renamed from: b */
    public final void mo69684b() {
        m114129a(this.f142921l, new brlc(this), new Object[0]);
    }

    /* renamed from: c */
    public final void mo69685c() {
        m114129a(this.f142913d, new brld(this), new Object[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.firebase.auth.api.gms.internal.SmsCodeAutoRetriever.a(java.util.List, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      com.google.firebase.auth.api.gms.internal.SmsCodeAutoRetriever.a(android.content.Context, android.content.Intent):void
      aacn.a(android.content.Context, android.content.Intent):void
      com.google.firebase.auth.api.gms.internal.SmsCodeAutoRetriever.a(java.util.List, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: brla.a(android.content.Context, java.lang.String, boolean):boolean
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      brla.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      brla.a(android.content.Context, java.lang.String, boolean):boolean */
    public final boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        String str;
        Message message2 = message;
        int i = message2.what;
        boolean z3 = false;
        if (i == 1) {
            Object[] objArr = (Object[]) message2.obj;
            Context context = (Context) objArr[0];
            brph brph = (brph) objArr[1];
            brpj brpj = (brpj) objArr[2];
            boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
            this.f142921l.add(new WeakReference(brpj));
            this.f142913d.add(new WeakReference(brpj));
            brla brla = brla.f142902a;
            if (booleanValue || !brla.mo69675a(context, this.f142923n, true)) {
                if (this.f142917h == 1) {
                    this.f142917h = 2;
                    Context applicationContext = context.getApplicationContext();
                    SmsCodeAutoRetriever smsCodeAutoRetriever = new SmsCodeAutoRetriever(applicationContext, new brlb(this, applicationContext));
                    this.f142916g = smsCodeAutoRetriever;
                    Context context2 = smsCodeAutoRetriever.f152498a;
                    svq b = svr.m36484b(context2);
                    int a = b.mo26169a("android.permission.READ_PHONE_STATE");
                    int a2 = b.mo26169a("android.permission.RECEIVE_SMS");
                    if (a != 0) {
                        z = false;
                    } else {
                        if (a2 == 0) {
                            int i2 = Build.VERSION.SDK_INT;
                            if (!((UserManager) context2.getSystemService("user")).hasUserRestriction("no_sms")) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    Context context3 = smsCodeAutoRetriever.f152498a;
                    PackageManager packageManager = context3.getPackageManager();
                    TelephonyManager telephonyManager = (TelephonyManager) context3.getSystemService("phone");
                    if (SmsCodeAutoRetriever.m118884a() || !packageManager.hasSystemFeature("android.hardware.telephony")) {
                        z2 = false;
                    } else {
                        z2 = telephonyManager.getPhoneType() != 0;
                    }
                    boolean a3 = SmsCodeAutoRetriever.m118884a();
                    if (z && z2 && !a3) {
                        smsCodeAutoRetriever.f152498a.registerReceiver(smsCodeAutoRetriever, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
                        smsCodeAutoRetriever.f152499b = true;
                        z3 = true;
                    }
                    this.f142915f = z3;
                    brlh brlh = new brlh(this, brpj);
                    brpy brpy = this.f142922m;
                    if (brpy instanceof SendVerificationCodeRequest) {
                        SendVerificationCodeRequest sendVerificationCodeRequest = (SendVerificationCodeRequest) brpy;
                        brlh brlh2 = new brlh(this, brlh);
                        sdo.m34977c(sendVerificationCodeRequest.f152548a);
                        sdo.m34959a(brlh2);
                        brph.f143125b.mo69775a(sendVerificationCodeRequest, new brqz(), cdxz.m135248c(), "sendVerificationCode", sendVerificationCodeRequest.f152551d).mo50371a(new brmd(new broc(brlh2)));
                    } else if (brpy instanceof brrg) {
                        brrg brrg = (brrg) brpy;
                        sdo.m34959a(brrg);
                        sdo.m34959a(brlh);
                        brph.f143125b.mo69775a(brrg, new brrh(), cdyc.m135275c(), "mfaSignIn:start", brrg.f143230c).mo50371a(new brls(new brot(brlh)));
                    } else {
                        brre brre = (brre) brpy;
                        sdo.m34959a(brre);
                        sdo.m34959a(brlh);
                        brph.f143125b.mo69775a(brre, new brrf(), cdyc.m135275c(), "mfaEnrollment:start", brre.f143223a).mo50371a(new brlp(new broo(brlh)));
                    }
                }
                int i3 = this.f142917h;
                if (i3 == 3 || i3 == 4) {
                    mo69684b();
                }
                if (this.f142917h == 4) {
                    mo69682a(true);
                }
            } else {
                f142910a.mo25416d("PhoneVerificationSession instant validation", new Object[0]);
                this.f142917h = 5;
                String str2 = this.f142920k;
                if (str2 == null) {
                    str = this.f142923n;
                } else {
                    str = null;
                }
                brpj.mo69759a(new PhoneAuthCredential(null, null, true, str, true, null, str2));
            }
        } else if (i == 2) {
            Object[] objArr2 = (Object[]) message2.obj;
            Context context4 = (Context) objArr2[0];
            String str3 = (String) objArr2[1];
            if (((Boolean) objArr2[2]).booleanValue()) {
                brla.f142902a.mo69676b(context4, this.f142923n);
            }
            if (this.f142914e) {
                this.f142919j = str3;
                if (!TextUtils.isEmpty(this.f142918i)) {
                    mo69682a(false);
                }
            }
            this.f142917h = 4;
        } else if (i != 3) {
            Logger Logger = f142910a;
            int i4 = message2.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i4);
            Logger.mo25416d(sb.toString(), new Object[0]);
            return false;
        } else {
            Integer num = (Integer) message2.obj;
            if (num == null || this.f142917h == num.intValue()) {
                if (this.f142914e) {
                    mo69685c();
                }
                if (this.f142917h == 3 && this.f142915f) {
                    this.f142916g.mo72408a((List) null, false);
                }
                this.f142917h = 5;
                f142910a.mo25416d("PhoneVerificationSession terminated", new Object[0]);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo69682a(boolean z) {
        if (!z) {
            if (this.f142924o) {
                return;
            }
        }
        this.f142924o = true;
        m114129a(this.f142913d, new brle(this), new Object[0]);
    }
}
