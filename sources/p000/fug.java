package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: fug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fug extends AsyncTask {

    /* renamed from: a */
    private final fva f17259a;

    /* renamed from: b */
    private final Context f17260b;

    /* renamed from: c */
    private final Intent f17261c;

    /* renamed from: d */
    private final long f17262d = SystemClock.uptimeMillis();

    /* renamed from: e */
    private final fuu f17263e;

    /* renamed from: f */
    private final fuv f17264f;

    /* renamed from: g */
    private final fuf f17265g;

    public fug(Context context, Intent intent, fuv fuv, fuf fuf) {
        this.f17259a = fva.m12456a(context);
        this.f17263e = new fuu(context);
        this.f17260b = context.getApplicationContext();
        this.f17261c = intent;
        this.f17264f = fuv;
        this.f17265g = fuf;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        if (r0.f169726e >= java.lang.System.currentTimeMillis()) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0597, code lost:
        if (p000.fzn.m12802a(r14, r0) != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0145, code lost:
        if ((r0.f169913a & 8) != 0) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03e4 A[SYNTHETIC, Splitter:B:165:0x03e4] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0781  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07da  */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        bzet bzet;
        bzet bzet2;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        boolean z;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i3;
        boolean z2;
        String str13;
        String str14;
        int i4;
        String str15;
        String str16;
        boolean z3;
        boolean z4;
        String str17;
        int i5;
        String str18;
        String str19;
        String str20;
        int i6;
        Intent intent;
        String str21;
        String str22;
        String str23;
        String str24;
        boolean z5;
        boolean z6;
        boolean z7;
        String str25;
        String str26;
        int i7;
        bxvd da;
        Bundle bundle;
        String str27;
        String str28;
        String str29;
        int i8;
        String str30;
        String str31;
        String str32;
        bzgd bzgd;
        boolean z8;
        int i9;
        String str33;
        boolean z9;
        boolean z10;
        String str34;
        String str35;
        int i10;
        String str36;
        String str37;
        String str38;
        boolean z11;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        Void[] voidArr = (Void[]) objArr;
        int i11 = !this.f17261c.getBooleanExtra("com.google.android.gms.appinvite.FROM_INTENT_URL", false) ? 2 : 3;
        String dataString = this.f17261c.getDataString();
        Intent intent2 = this.f17261c;
        if (cbvz.f178436a.mo6606a().mo75534q()) {
            String stringExtra = intent2.getStringExtra("signature");
            try {
                byte[] a = sqd.m35966a(intent2.getStringExtra("response"));
                Signature instance = Signature.getInstance("SHA256withECDSA");
                instance.initVerify(KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(sqd.m35966a(cbvz.f178436a.mo6606a().mo75535r()))));
                instance.update(a);
                if (instance.verify(sqd.m35966a(stringExtra))) {
                    bzet = (bzet) GeneratedMessageLite.m124016a(bzet.f169719f, a, bxus.m123744c());
                }
            } catch (Exception e) {
            }
        }
        bzet = null;
        if (bzet == null && !TextUtils.isEmpty(dataString)) {
            ClientContext clientContext = new ClientContext();
            clientContext.f30212b = Process.myUid();
            clientContext.f30215e = this.f17260b.getPackageName();
            clientContext.f30216f = this.f17260b.getPackageName();
            bzet2 = this.f17259a.f17325a.mo11382a(clientContext, dataString);
            if (!(bzet2 == null || (bzet2.f169722a & 1) == 0)) {
                bzgd bzgd2 = bzet2.f169723b;
                if (bzgd2 == null) {
                    bzgd2 = bzgd.f169911g;
                }
                if (!bzgd2.f169918f.isEmpty()) {
                    fva fva = this.f17259a;
                    bzgd bzgd3 = bzet2.f169723b;
                    if (bzgd3 == null) {
                        bzgd3 = bzgd.f169911g;
                    }
                    Uri parse = Uri.parse(bzgd3.f169918f);
                    bzet2 = new fuz(fva.f17326b, new fux(new sgv(fva.f17326b, String.format("%s://%s", parse.getScheme(), parse.getHost()), parse.getPath(), cbvz.m128696d(), cbvz.m128700h(), cbvz.m128695c(), cbvz.m128697e(), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk"))).mo11382a(clientContext, dataString);
                }
            }
        } else {
            bzet2 = bzet;
        }
        if (!(bzet2 == null || (bzet2.f169722a & 1) == 0)) {
            bzgd bzgd4 = bzet2.f169723b;
            if (bzgd4 == null) {
                bzgd4 = bzgd.f169911g;
            }
            if (bzgd4.f169914b.isEmpty()) {
                bzgd bzgd5 = bzet2.f169723b;
                if (bzgd5 == null) {
                    bzgd5 = bzgd.f169911g;
                }
            }
            bzgd bzgd6 = bzet2.f169723b;
            if (bzgd6 != null) {
                bzgd = bzgd6;
            } else {
                bzgd = bzgd.f169911g;
            }
            if ((bzgd.f169913a & 8) == 0) {
                z9 = false;
                str33 = null;
                i9 = 0;
                z8 = false;
            } else {
                bzeu bzeu = bzgd.f169917e;
                if (bzeu == null) {
                    bzeu = bzeu.f169727d;
                }
                str33 = bzeu.f169730b;
                if ((bzeu.f169729a & 2) != 0) {
                    i9 = bzeu.f169731c;
                } else {
                    i9 = 0;
                }
                z8 = spn.m35892g(this.f17260b, str33);
                if (z8) {
                    try {
                        z9 = this.f17260b.getPackageManager().getPackageInfo(str33, 0).versionCode < i9;
                    } catch (PackageManager.NameNotFoundException e2) {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
            }
            String str45 = bzgd.f169915c;
            String str46 = bzgd.f169914b;
            bzfx bzfx = bzgd.f169916d;
            if (bzfx == null) {
                bzfx = bzfx.f169887d;
            }
            str12 = bzfx.f169890b;
            if (fzn.m12804a(str46)) {
                z10 = !TextUtils.isEmpty(Uri.parse(str46).getQueryParameter("url"));
            } else {
                z10 = false;
            }
            if ((bzet2.f169722a & 4) == 0) {
                z11 = z9;
                str43 = null;
                str42 = null;
                str41 = null;
                str40 = null;
                str39 = null;
                str38 = null;
                str37 = null;
                str36 = null;
                i10 = 1;
                str35 = null;
                str2 = null;
                str34 = null;
            } else {
                bzfh bzfh = bzet2.f169725d;
                if (bzfh == null) {
                    bzfh = bzfh.f169799l;
                }
                if ((bzfh.f169801a & 32) == 0) {
                    z11 = z9;
                    str43 = null;
                    str42 = null;
                    str41 = null;
                    str40 = null;
                    str39 = null;
                    str38 = null;
                    str37 = null;
                    str36 = null;
                    i10 = 1;
                    str35 = null;
                    str2 = null;
                    str34 = null;
                } else {
                    bzfh bzfh2 = bzet2.f169725d;
                    if (bzfh2 == null) {
                        bzfh2 = bzfh.f169799l;
                    }
                    str40 = bzfh2.f169806f;
                    String str47 = bzfh2.f169809i;
                    bzgt bzgt = bzfh2.f169807g;
                    if (bzgt == null) {
                        bzgt = bzgt.f169976d;
                    }
                    str41 = bzgt.f169979b;
                    z11 = z9;
                    bzgt bzgt2 = bzfh2.f169807g;
                    if (bzgt2 == null) {
                        bzgt2 = bzgt.f169976d;
                    }
                    int a2 = bzgs.m125778a(bzgt2.f169978a);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    str38 = str47;
                    bzgt bzgt3 = bzfh2.f169807g;
                    if (bzgt3 == null) {
                        bzgt3 = bzgt.f169976d;
                    }
                    str37 = bzgt3.f169980c;
                    str36 = bzfh2.f169808h;
                    if (a2 != 2) {
                        if (a2 != 3) {
                            i10 = a2;
                            str43 = null;
                            str42 = null;
                            str39 = null;
                            str37 = null;
                            str35 = null;
                            str2 = null;
                            str34 = null;
                        }
                    }
                    str42 = bzfh2.f169802b;
                    i10 = a2;
                    String str48 = bzfh2.f169804d;
                    if (cbwa.m128706e()) {
                        str35 = str48;
                        String str49 = bzfh2.f169810j;
                        str2 = bzfh2.f169811k;
                        str44 = str49;
                    } else {
                        str35 = str48;
                        str44 = null;
                        str2 = null;
                    }
                    str34 = str44;
                    str43 = bzfh2.f169803c;
                    str39 = bzfh2.f169805e;
                }
            }
            String str50 = str43;
            fjk a3 = this.f17263e.mo11370a();
            String str51 = str42;
            bzft bzft = bzet2.f169724c;
            if (bzft == null) {
                bzft = bzft.f169867c;
            }
            fuu.m12428a(a3, bzft);
            bzft bzft2 = bzet2.f169724c;
            if (bzft2 == null) {
                bzft2 = bzft.f169867c;
            }
            bzfm bzfm = bzft2.f169870b;
            if (bzfm == null) {
                bzfm = bzfm.f169831c;
            }
            if (bzfm.f169834b.isEmpty()) {
                str14 = str39;
                z3 = z11;
                str = str36;
                str8 = str34;
                i = 1;
                z = z8;
                str5 = str38;
                str9 = str35;
                str3 = str41;
                i2 = i11;
                i4 = i10;
                str15 = str51;
                str4 = str40;
                i3 = i9;
                str10 = str33;
                str11 = str45;
                str7 = str46;
                z2 = z10;
                str16 = str50;
                str6 = dataString;
                str13 = str37;
            } else {
                bzft bzft3 = bzet2.f169724c;
                if (bzft3 == null) {
                    bzft3 = bzft.f169867c;
                }
                bzfm bzfm2 = bzft3.f169870b;
                if (bzfm2 == null) {
                    bzfm2 = bzfm.f169831c;
                }
                if (((bzfn) bzfm2.f169834b.get(0)).f169843f.isEmpty()) {
                    str14 = str39;
                    z3 = z11;
                    str = str36;
                    str8 = str34;
                    i = 1;
                    z = z8;
                    str5 = str38;
                    str9 = str35;
                    str3 = str41;
                    i2 = i11;
                    i4 = i10;
                    str15 = str51;
                    str4 = str40;
                    i3 = i9;
                    str10 = str33;
                    str11 = str45;
                    str7 = str46;
                    z2 = z10;
                    str16 = str50;
                    str6 = dataString;
                    str13 = str37;
                } else {
                    bzft bzft4 = bzet2.f169724c;
                    if (bzft4 == null) {
                        bzft4 = bzft.f169867c;
                    }
                    bzfm bzfm3 = bzft4.f169870b;
                    if (bzfm3 == null) {
                        bzfm3 = bzfm.f169831c;
                    }
                    String str52 = ((bzfl) ((bzfn) bzfm3.f169834b.get(0)).f169843f.get(0)).f169829b;
                    if ("Email".equals(str52)) {
                        str14 = str39;
                        z3 = z11;
                        str = str36;
                        str8 = str34;
                        i = 3;
                        z = z8;
                        str5 = str38;
                        str9 = str35;
                        str3 = str41;
                        i2 = i11;
                        i4 = i10;
                        str15 = str51;
                        str4 = str40;
                        i3 = i9;
                        str10 = str33;
                        str11 = str45;
                        str7 = str46;
                        z2 = z10;
                        str16 = str50;
                        str6 = dataString;
                        str13 = str37;
                    } else {
                        str14 = str39;
                        z3 = z11;
                        str = str36;
                        str8 = str34;
                        i = "Sms".equals(str52) ? 4 : 1;
                        z = z8;
                        str5 = str38;
                        str9 = str35;
                        str3 = str41;
                        i2 = i11;
                        i4 = i10;
                        str15 = str51;
                        str4 = str40;
                        i3 = i9;
                        str10 = str33;
                        str11 = str45;
                        str7 = str46;
                        z2 = z10;
                        str16 = str50;
                        str6 = dataString;
                        str13 = str37;
                    }
                }
            }
            String str53 = str8;
            Context context = this.f17260b;
            String str54 = str9;
            Intent intent3 = this.f17261c;
            z4 = TextUtils.isEmpty(str10) && spn.m35892g(context, str10);
            if (!z4) {
                try {
                    str17 = str14;
                    try {
                        if (context.getPackageManager().getApplicationInfo(str10, 0).enabled) {
                            i5 = context.getPackageManager().getPackageInfo(str10, 0).versionCode;
                        } else {
                            i5 = 0;
                            z4 = false;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        i5 = 0;
                        if (z4) {
                        }
                        if (TextUtils.isEmpty(str7)) {
                        }
                        if (intent == null) {
                        }
                        fuv fuv = this.f17264f;
                        if (!z5) {
                        }
                        if (z) {
                        }
                        long uptimeMillis = SystemClock.uptimeMillis() - this.f17262d;
                        da = boim.f133185j.mo74144da();
                        if (!TextUtils.isEmpty(str21)) {
                        }
                        if (da.f164950c) {
                        }
                        boim boim = (boim) da.f164949b;
                        boim.f133189c = i - 1;
                        int i12 = boim.f133187a | 2;
                        boim.f133187a = i12;
                        boim.f133190d = i7 - 1;
                        int i13 = i12 | 8;
                        boim.f133187a = i13;
                        boim.f133187a = i13 | 16;
                        boim.f133191e = z6;
                        boiz a4 = fuv.m12432a(str24, str22, str26, i4, str7);
                        if (da.f164950c) {
                        }
                        boim boim2 = (boim) da.f164949b;
                        a4.getClass();
                        boim2.f133192f = a4;
                        boim2.f133187a |= 32;
                        int a5 = fuv.m12431a(z7, z3);
                        if (da.f164950c) {
                        }
                        boim boim3 = (boim) da.f164949b;
                        boim3.f133193g = a5 - 1;
                        int i14 = boim3.f133187a | 64;
                        boim3.f133187a = i14;
                        int i15 = i14 | 128;
                        boim3.f133187a = i15;
                        boim3.f133194h = uptimeMillis;
                        boim3.f133195i = i2 - 1;
                        boim3.f133187a = i15 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        fuv.mo11372a((boim) da.mo74062i(), 10, str25);
                        return intent;
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    str17 = str14;
                    i5 = 0;
                    if (z4) {
                    }
                    if (TextUtils.isEmpty(str7)) {
                    }
                    if (intent == null) {
                    }
                    fuv fuv2 = this.f17264f;
                    if (!z5) {
                    }
                    if (z) {
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis() - this.f17262d;
                    da = boim.f133185j.mo74144da();
                    if (!TextUtils.isEmpty(str21)) {
                    }
                    if (da.f164950c) {
                    }
                    boim boim4 = (boim) da.f164949b;
                    boim4.f133189c = i - 1;
                    int i122 = boim4.f133187a | 2;
                    boim4.f133187a = i122;
                    boim4.f133190d = i7 - 1;
                    int i132 = i122 | 8;
                    boim4.f133187a = i132;
                    boim4.f133187a = i132 | 16;
                    boim4.f133191e = z6;
                    boiz a42 = fuv.m12432a(str24, str22, str26, i4, str7);
                    if (da.f164950c) {
                    }
                    boim boim22 = (boim) da.f164949b;
                    a42.getClass();
                    boim22.f133192f = a42;
                    boim22.f133187a |= 32;
                    int a52 = fuv.m12431a(z7, z3);
                    if (da.f164950c) {
                    }
                    boim boim32 = (boim) da.f164949b;
                    boim32.f133193g = a52 - 1;
                    int i142 = boim32.f133187a | 64;
                    boim32.f133187a = i142;
                    int i152 = i142 | 128;
                    boim32.f133187a = i152;
                    boim32.f133194h = uptimeMillis2;
                    boim32.f133195i = i2 - 1;
                    boim32.f133187a = i152 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    fuv2.mo11372a((boim) da.mo74062i(), 10, str25);
                    return intent;
                }
            } else {
                str17 = str14;
                i5 = 0;
            }
            if (z4) {
                if (i3 == 0) {
                    str19 = str16;
                    str18 = str15;
                    str20 = str13;
                    i6 = i3;
                } else if (i5 >= i3) {
                    str19 = str16;
                    str18 = str15;
                    str20 = str13;
                    i6 = i3;
                }
                intent = context.getPackageManager().getLaunchIntentForPackage(str10);
                if (!TextUtils.isEmpty(str11)) {
                    Uri parse2 = Uri.parse(str11);
                    if (!TextUtils.isEmpty(str12)) {
                        parse2 = parse2.buildUpon().appendQueryParameter("invitation_id", str12).build();
                    }
                    Intent intent4 = new Intent("android.intent.action.VIEW").setPackage(str10);
                    fzn.m12801a(intent3, intent4);
                    intent4.setData(parse2);
                    fur.m12412a(str12, str11, intent4);
                    if (fzn.m12802a(context, intent4)) {
                        intent = intent4;
                        if (intent == null) {
                            boolean z12 = !z;
                            boolean a6 = fzn.m12803a(intent);
                            if (!z) {
                                z6 = false;
                            } else {
                                if (!z3) {
                                    Context context2 = this.f17260b;
                                    if (intent.getData() != null && ((intent.getComponent() == null || TextUtils.isEmpty(intent.getComponent().getClassName())) && context2.getPackageManager().resolveActivity(intent, 0) != null)) {
                                        z6 = true;
                                    }
                                }
                                z6 = false;
                            }
                            int i16 = i4 - 1;
                            SharedPreferences.Editor edit = fzr.m12811a(this.f17260b, str10).edit();
                            edit.putString("Existence Indicator", "Existence Indicator");
                            edit.putString("invitationId", str12);
                            edit.putString("deepLink", str11);
                            edit.putBoolean("isNewInstall", z12);
                            edit.putBoolean("isInlineInstall", a6);
                            edit.putInt("invitationChannel", i - 1);
                            edit.putBoolean("launchFromContinueUrl", z2);
                            edit.putBoolean("scionInstallEvent", false);
                            edit.putBoolean("loggerInstallEvent", false);
                            edit.putBoolean("hasReturnedInvitation", false);
                            edit.putBoolean("isUpgradeInstall", z3);
                            edit.putString("scionSource", str18);
                            edit.putString("scionMedium", str19);
                            edit.putString("scionLinkName", str20);
                            edit.putString("scionLinkId", str17);
                            edit.putString("scionCampaign", str54);
                            if (cbwa.m128706e()) {
                                edit.putString("scionContent", str53);
                                edit.putString("scionTerm", str2);
                            }
                            edit.putString("requestedLink", str3);
                            edit.putInt("requestedLinkType", i16);
                            edit.putString("appCode", str4);
                            edit.putString("domainUriPrefix", str5);
                            String str55 = str3;
                            String str56 = str;
                            edit.putString("sessionId", str56);
                            boolean z13 = z12;
                            int i17 = i6;
                            edit.putInt("minVersionCode", i17);
                            str22 = str5;
                            edit.putLong("creationTimestamp", System.currentTimeMillis());
                            edit.commit();
                            if (!cbvz.f178436a.mo6606a().mo75536s()) {
                                str21 = str10;
                                str26 = str55;
                                str24 = str4;
                                z5 = a6;
                                str23 = str11;
                                str25 = str56;
                            } else if (z && !z3) {
                                if (!TextUtils.isEmpty(str12)) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("com.google.firebase.appinvite.fdl.extension.InvitationId", str12);
                                    bundle = bundle2;
                                } else {
                                    bundle = null;
                                }
                                str24 = str4;
                                str21 = str10;
                                str23 = str11;
                                str26 = str55;
                                z5 = a6;
                                str25 = str56;
                                sef.m35071a(new DynamicLinkData(str6, str11, i17, fzr.m12817d(this.f17260b, str10).longValue(), bundle, null), intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
                            } else {
                                str21 = str10;
                                str26 = str55;
                                str24 = str4;
                                z5 = a6;
                                str23 = str11;
                                str25 = str56;
                            }
                            z7 = z13;
                        } else {
                            str21 = str10;
                            str24 = str4;
                            str26 = str3;
                            str25 = str;
                            str23 = str11;
                            str22 = str5;
                            z7 = false;
                            z6 = false;
                            z5 = false;
                        }
                        fuv fuv22 = this.f17264f;
                        if (!z5) {
                            i7 = 3;
                        } else {
                            i7 = z7 ? 2 : 1;
                        }
                        if (z) {
                            str7 = str23;
                        }
                        long uptimeMillis22 = SystemClock.uptimeMillis() - this.f17262d;
                        da = boim.f133185j.mo74144da();
                        if (!TextUtils.isEmpty(str21)) {
                            bxvd da2 = boje.f133263c.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            boje boje = (boje) da2.f164949b;
                            str21.getClass();
                            boje.f133265a |= 2;
                            boje.f133266b = str21;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boim boim5 = (boim) da.f164949b;
                            boje boje2 = (boje) da2.mo74062i();
                            boje2.getClass();
                            boim5.f133188b = boje2;
                            boim5.f133187a |= 1;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boim boim42 = (boim) da.f164949b;
                        boim42.f133189c = i - 1;
                        int i1222 = boim42.f133187a | 2;
                        boim42.f133187a = i1222;
                        boim42.f133190d = i7 - 1;
                        int i1322 = i1222 | 8;
                        boim42.f133187a = i1322;
                        boim42.f133187a = i1322 | 16;
                        boim42.f133191e = z6;
                        if (!TextUtils.isEmpty(str24) || !TextUtils.isEmpty(str22)) {
                            boiz a422 = fuv.m12432a(str24, str22, str26, i4, str7);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boim boim222 = (boim) da.f164949b;
                            a422.getClass();
                            boim222.f133192f = a422;
                            boim222.f133187a |= 32;
                        }
                        int a522 = fuv.m12431a(z7, z3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boim boim322 = (boim) da.f164949b;
                        boim322.f133193g = a522 - 1;
                        int i1422 = boim322.f133187a | 64;
                        boim322.f133187a = i1422;
                        int i1522 = i1422 | 128;
                        boim322.f133187a = i1522;
                        boim322.f133194h = uptimeMillis22;
                        boim322.f133195i = i2 - 1;
                        boim322.f133187a = i1522 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        fuv22.mo11372a((boim) da.mo74062i(), 10, str25);
                        return intent;
                    } else if (intent != null) {
                        intent.setData(parse2);
                    }
                }
                if (intent != null) {
                    fzn.m12801a(intent3, intent);
                    fur.m12412a(str12, str11, intent);
                }
                intent = null;
                if (intent == null) {
                }
                fuv fuv222 = this.f17264f;
                if (!z5) {
                }
                if (z) {
                }
                long uptimeMillis222 = SystemClock.uptimeMillis() - this.f17262d;
                da = boim.f133185j.mo74144da();
                if (!TextUtils.isEmpty(str21)) {
                }
                if (da.f164950c) {
                }
                boim boim422 = (boim) da.f164949b;
                boim422.f133189c = i - 1;
                int i12222 = boim422.f133187a | 2;
                boim422.f133187a = i12222;
                boim422.f133190d = i7 - 1;
                int i13222 = i12222 | 8;
                boim422.f133187a = i13222;
                boim422.f133187a = i13222 | 16;
                boim422.f133191e = z6;
                boiz a4222 = fuv.m12432a(str24, str22, str26, i4, str7);
                if (da.f164950c) {
                }
                boim boim2222 = (boim) da.f164949b;
                a4222.getClass();
                boim2222.f133192f = a4222;
                boim2222.f133187a |= 32;
                int a5222 = fuv.m12431a(z7, z3);
                if (da.f164950c) {
                }
                boim boim3222 = (boim) da.f164949b;
                boim3222.f133193g = a5222 - 1;
                int i14222 = boim3222.f133187a | 64;
                boim3222.f133187a = i14222;
                int i15222 = i14222 | 128;
                boim3222.f133187a = i15222;
                boim3222.f133194h = uptimeMillis222;
                boim3222.f133195i = i2 - 1;
                boim3222.f133187a = i15222 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                fuv222.mo11372a((boim) da.mo74062i(), 10, str25);
                return intent;
            }
            if (TextUtils.isEmpty(str7)) {
                if (!fzn.m12804a(str7)) {
                    Uri parse3 = Uri.parse(str7);
                    i8 = i3;
                    String host = parse3.getHost();
                    if (host != null) {
                        str29 = str13;
                        if (host.endsWith(".app.goo.gl")) {
                            String host2 = Uri.parse(str7).getHost();
                            if (host2.endsWith(".app.goo.gl")) {
                                str27 = str16;
                                str32 = host2.substring(0, host2.length() - 11);
                            } else {
                                str27 = str16;
                                str32 = null;
                            }
                            Uri.Builder buildUpon = parse3.buildUpon();
                            buildUpon.authority("goo.gl");
                            String path = parse3.getPath();
                            str28 = str15;
                            StringBuilder sb = new StringBuilder(String.valueOf(str32).length() + 4 + String.valueOf(path).length());
                            sb.append("app/");
                            sb.append(str32);
                            sb.append(path);
                            buildUpon.encodedPath(sb.toString());
                            str30 = buildUpon.toString();
                            intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str30));
                            fzn.m12801a(intent3, intent);
                        } else {
                            str31 = str16;
                            str28 = str15;
                        }
                    } else {
                        str31 = str16;
                        str28 = str15;
                        str29 = str13;
                    }
                    str30 = str7;
                    intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str30));
                    fzn.m12801a(intent3, intent);
                } else {
                    str27 = str16;
                    str28 = str15;
                    str29 = str13;
                    i8 = i3;
                    if (!cbvz.f178436a.mo6606a().mo75533p()) {
                        intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str7));
                        intent.setPackage("com.android.vending");
                        intent.addFlags(335544320);
                    } else {
                        String packageName = context.getPackageName();
                        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str10);
                        String queryParameter = Uri.parse(str7).getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            appendQueryParameter.appendQueryParameter("referrer", queryParameter);
                        }
                        Intent intent5 = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
                        intent5.setPackage("com.android.vending");
                        intent5.putExtra("overlay", true);
                        intent5.putExtra("callerId", packageName);
                        intent = intent5;
                    }
                }
                if (!fzn.m12802a(context, intent)) {
                    intent = null;
                }
            } else {
                str19 = str16;
                str18 = str15;
                str20 = str13;
                i6 = i3;
                intent = null;
            }
            if (intent == null) {
            }
            fuv fuv2222 = this.f17264f;
            if (!z5) {
            }
            if (z) {
            }
            long uptimeMillis2222 = SystemClock.uptimeMillis() - this.f17262d;
            da = boim.f133185j.mo74144da();
            if (!TextUtils.isEmpty(str21)) {
            }
            if (da.f164950c) {
            }
            boim boim4222 = (boim) da.f164949b;
            boim4222.f133189c = i - 1;
            int i122222 = boim4222.f133187a | 2;
            boim4222.f133187a = i122222;
            boim4222.f133190d = i7 - 1;
            int i132222 = i122222 | 8;
            boim4222.f133187a = i132222;
            boim4222.f133187a = i132222 | 16;
            boim4222.f133191e = z6;
            boiz a42222 = fuv.m12432a(str24, str22, str26, i4, str7);
            if (da.f164950c) {
            }
            boim boim22222 = (boim) da.f164949b;
            a42222.getClass();
            boim22222.f133192f = a42222;
            boim22222.f133187a |= 32;
            int a52222 = fuv.m12431a(z7, z3);
            if (da.f164950c) {
            }
            boim boim32222 = (boim) da.f164949b;
            boim32222.f133193g = a52222 - 1;
            int i142222 = boim32222.f133187a | 64;
            boim32222.f133187a = i142222;
            int i152222 = i142222 | 128;
            boim32222.f133187a = i152222;
            boim32222.f133194h = uptimeMillis2222;
            boim32222.f133195i = i2 - 1;
            boim32222.f133187a = i152222 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            fuv2222.mo11372a((boim) da.mo74062i(), 10, str25);
            return intent;
        }
        Uri data = this.f17261c.getData();
        i2 = i11;
        str6 = dataString;
        str7 = (data == null || !TextUtils.isEmpty(data.getQueryParameter("_nr"))) ? null : data.buildUpon().appendQueryParameter("_nr", "1").toString();
        z3 = false;
        str16 = null;
        str15 = null;
        i4 = 1;
        str14 = null;
        str13 = null;
        z2 = false;
        i3 = 0;
        str12 = null;
        str11 = null;
        str10 = null;
        str9 = null;
        str8 = null;
        z = false;
        str5 = null;
        str4 = null;
        str3 = null;
        str2 = null;
        i = 1;
        str = null;
        String str532 = str8;
        Context context3 = this.f17260b;
        String str542 = str9;
        Intent intent32 = this.f17261c;
        if (TextUtils.isEmpty(str10)) {
        }
        if (!z4) {
        }
        if (z4) {
        }
        if (TextUtils.isEmpty(str7)) {
        }
        if (intent == null) {
        }
        fuv fuv22222 = this.f17264f;
        if (!z5) {
        }
        if (z) {
        }
        long uptimeMillis22222 = SystemClock.uptimeMillis() - this.f17262d;
        da = boim.f133185j.mo74144da();
        if (!TextUtils.isEmpty(str21)) {
        }
        if (da.f164950c) {
        }
        boim boim42222 = (boim) da.f164949b;
        boim42222.f133189c = i - 1;
        int i1222222 = boim42222.f133187a | 2;
        boim42222.f133187a = i1222222;
        boim42222.f133190d = i7 - 1;
        int i1322222 = i1222222 | 8;
        boim42222.f133187a = i1322222;
        boim42222.f133187a = i1322222 | 16;
        boim42222.f133191e = z6;
        boiz a422222 = fuv.m12432a(str24, str22, str26, i4, str7);
        if (da.f164950c) {
        }
        boim boim222222 = (boim) da.f164949b;
        a422222.getClass();
        boim222222.f133192f = a422222;
        boim222222.f133187a |= 32;
        int a522222 = fuv.m12431a(z7, z3);
        if (da.f164950c) {
        }
        boim boim322222 = (boim) da.f164949b;
        boim322222.f133193g = a522222 - 1;
        int i1422222 = boim322222.f133187a | 64;
        boim322222.f133187a = i1422222;
        int i1522222 = i1422222 | 128;
        boim322222.f133187a = i1522222;
        boim322222.f133194h = uptimeMillis22222;
        boim322222.f133195i = i2 - 1;
        boim322222.f133187a = i1522222 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        fuv22222.mo11372a((boim) da.mo74062i(), 10, str25);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Intent intent = (Intent) obj;
        if (!isCancelled()) {
            fuf fuf = this.f17265g;
            fuf.f17257b = true;
            fuf.f17258c = intent;
            fuf.mo11342a(fuf.getActivity());
        }
    }
}
