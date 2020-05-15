package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.text.Html;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.appinvite.AppInviteIntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: fus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fus extends sji {

    /* renamed from: a */
    public final long f17283a = AppInviteIntentOperation.m6188a();

    /* renamed from: d */
    private final Context f17284d;

    /* renamed from: e */
    private final String f17285e;

    /* renamed from: f */
    private final String f17286f;

    /* renamed from: g */
    private final String f17287g;

    /* renamed from: h */
    private final String f17288h;

    /* renamed from: i */
    private final String f17289i;

    /* renamed from: j */
    private final String f17290j;

    /* renamed from: k */
    private final Map f17291k;

    /* renamed from: l */
    private final String f17292l;

    /* renamed from: m */
    private final String f17293m;

    /* renamed from: n */
    private final List f17294n;

    /* renamed from: o */
    private final String f17295o;

    /* renamed from: p */
    private final String f17296p;

    /* renamed from: q */
    private final Uri f17297q;

    /* renamed from: r */
    private final Bitmap f17298r;

    /* renamed from: s */
    private final String f17299s;

    /* renamed from: t */
    private final String f17300t;

    /* renamed from: u */
    private final int f17301u;

    /* renamed from: v */
    private final fva f17302v;

    /* renamed from: w */
    private final fuu f17303w;

    /* renamed from: x */
    private fjk f17304x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fus(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map map, String str7, String str8, List list, String str9, String str10, Uri uri, Bitmap bitmap, String str11, String str12, int i) {
        super(0, "AppInviteSend");
        PackageInfo packageInfo;
        String str13;
        String str14 = str7;
        fuu fuu = new fuu(context);
        fva a = fva.m12456a(context);
        this.f17284d = context;
        this.f17286f = str;
        this.f17285e = str2;
        this.f17287g = str3;
        this.f17289i = str4;
        this.f17288h = str5;
        this.f17290j = str6;
        this.f17291k = map;
        this.f17292l = str14;
        this.f17293m = str8;
        this.f17294n = list;
        this.f17295o = str9;
        this.f17296p = str10;
        this.f17297q = uri;
        this.f17298r = bitmap;
        this.f17299s = str11;
        this.f17300t = str12;
        this.f17301u = i;
        this.f17303w = fuu;
        this.f17302v = a;
        if (!TextUtils.isEmpty(str7)) {
            fjk a2 = this.f17303w.mo11370a();
            this.f17304x = a2;
            fuu.m12429a(a2, str14);
            PackageManager packageManager = this.f17284d.getPackageManager();
            String str15 = null;
            try {
                packageInfo = packageManager.getPackageInfo(this.f17286f, 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                String str16 = packageInfo.versionName;
                str15 = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                str13 = str16;
            } else {
                str13 = null;
            }
            fjk fjk = this.f17304x;
            String str17 = this.f17286f;
            if (!TextUtils.isEmpty(str15)) {
                fjk.mo10894b(str15);
            }
            if (!TextUtils.isEmpty(str17)) {
                fjk.mo10892a("&aid", str17);
            }
            if (!TextUtils.isEmpty(str13)) {
                fjk.mo10895c(str13);
            }
        }
    }

    /* renamed from: a */
    private final void m12413a(Exception exc) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("appOperationCode", this.f17283a);
        if (exc instanceof fup) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 1);
            intent.putExtra("com.google.android.gms.appinvite.errorCode", ((fup) exc).f17280a);
        } else if (exc instanceof VolleyError) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 2);
        } else if (exc instanceof UserRecoverableAuthException) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 3);
            intent.putExtra("com.google.android.gms.appinvite.authIntent", ((UserRecoverableAuthException) exc).mo7366a());
        } else if (exc instanceof gid) {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 3);
        } else {
            intent.putExtra("com.google.android.gms.appinvite.errorType", 0);
        }
        AppInviteIntentOperation.m6189a(this.f17283a, intent);
        this.f17284d.sendBroadcast(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0082 A[Catch:{ VolleyError | fup | gid -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x007b A[Catch:{ VolleyError | fup | gid -> 0x033d }] */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        int i;
        int i2;
        byte[] bArr;
        Uri uri;
        String str;
        bzfd a;
        int i3;
        bzgf bzgf;
        String str2;
        ReentrantLock reentrantLock;
        Account account = new Account(this.f17285e, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.f30215e = this.f17286f;
        clientContext.f30216f = this.f17284d.getPackageName();
        clientContext.mo17799a(new String[]{"https://www.googleapis.com/auth/plus.native"});
        if (this.f17298r != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (this.f17298r.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                bArr = byteArrayOutputStream.toByteArray();
                i = this.f17298r.getWidth();
                i2 = this.f17298r.getHeight();
                fva fva = this.f17302v;
                String str3 = this.f17287g;
                String str4 = this.f17289i;
                String str5 = this.f17288h;
                String str6 = this.f17290j;
                Map map = this.f17291k;
                List list = this.f17294n;
                String str7 = this.f17292l;
                String str8 = this.f17295o;
                String str9 = this.f17296p;
                uri = this.f17297q;
                if (uri == null) {
                    str = uri.toString();
                } else {
                    str = null;
                }
                a = fva.mo11385a(clientContext, str3, str4, str5, null, str6, map, null, null, list, str7, str8, str9, str, bArr, i2, i, this.f17299s, this.f17300t, this.f17301u, this.f17293m);
                if (a == null) {
                    bzft bzft = a.f169789b;
                    if (bzft == null) {
                        bzft = bzft.f169867c;
                    }
                    if (bzft == null) {
                        i3 = 0;
                    } else if ((bzft.f169869a & 1) != 0) {
                        bzfm bzfm = bzft.f169870b;
                        if (bzfm == null) {
                            bzfm = bzfm.f169831c;
                        }
                        if (!bzfm.f169834b.isEmpty()) {
                            bzfm bzfm2 = bzft.f169870b;
                            if (bzfm2 == null) {
                                bzfm2 = bzfm.f169831c;
                            }
                            bxvd bxvd = (bxvd) bzfm2.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) bzfm2);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            ((bzfm) bxvd.f164949b).f169834b = GeneratedMessageLite.m124030de();
                            bzfm bzfm3 = bzft.f169870b;
                            if (bzfm3 == null) {
                                bzfm3 = bzfm.f169831c;
                            }
                            bxwc bxwc = bzfm3.f169834b;
                            int size = bxwc.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                bzfn bzfn = (bzfn) bxwc.get(i4);
                                if (bzfn.f169843f.size() <= 0 || !"Sms".equals(((bzfl) bzfn.f169843f.get(0)).f169829b) || !"Sent".equals(bzfn.f169840c) || !"Invitation".equals(bzfn.f169839b)) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bzfm bzfm4 = (bzfm) bxvd.f164949b;
                                    bzfn.getClass();
                                    if (!bzfm4.f169834b.mo73666a()) {
                                        bzfm4.f169834b = GeneratedMessageLite.m124021a(bzfm4.f169834b);
                                    }
                                    bzfm4.f169834b.add(bzfn);
                                }
                            }
                            bxvd bxvd2 = (bxvd) bzft.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) bzft);
                            if (!bxvd2.f164950c) {
                                i3 = 0;
                            } else {
                                bxvd2.mo74035c();
                                i3 = 0;
                                bxvd2.f164950c = false;
                            }
                            bzft bzft2 = (bzft) bxvd2.f164949b;
                            bzfm bzfm5 = (bzfm) bxvd.mo74062i();
                            bzfm5.getClass();
                            bzft2.f169870b = bzfm5;
                            bzft2.f169869a |= 1;
                            fuu.m12428a(this.f17304x, (bzft) bxvd2.mo74062i());
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = 0;
                    }
                    bxwc bxwc2 = a.f169788a;
                    if (bxwc2.isEmpty()) {
                        m12413a((Exception) null);
                        return;
                    }
                    String[] strArr = new String[bxwc2.size()];
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i5 = 0; i5 < bxwc2.size(); i5++) {
                        bzgf bzgf2 = ((bzfr) bxwc2.get(i5)).f169861c;
                        if (bzgf2 == null) {
                            bzgf = bzgf.f169924e;
                        } else {
                            bzgf = bzgf2;
                        }
                        if ((((bzfr) bxwc2.get(i5)).f169859a & 1) != 0) {
                            bzfx bzfx = ((bzfr) bxwc2.get(i5)).f169860b;
                            if (bzfx == null) {
                                bzfx = bzfx.f169887d;
                            }
                            str2 = bzfx.f169890b;
                        } else {
                            str2 = null;
                        }
                        strArr[i5] = str2;
                        if ((((bzfr) bxwc2.get(i5)).f169859a & 4) != 0) {
                            if ((bzgf.f169926a & 2) != 0) {
                                bzfg bzfg = bzgf.f169928c;
                                if (bzfg == null) {
                                    bzfg = bzfg.f169792f;
                                }
                                int a2 = bzff.m125739a(bzfg.f169795b);
                                if (a2 != 0 && a2 == 4) {
                                    bzfg bzfg2 = bzgf.f169928c;
                                    if (bzfg2 == null) {
                                        bzfg2 = bzfg.f169792f;
                                    }
                                    if (!bzfg2.f169798e.isEmpty()) {
                                        bzgc bzgc = ((bzfr) bxwc2.get(i5)).f169862d;
                                        if (bzgc == null) {
                                            bzgc = bzgc.f169907b;
                                        }
                                        if (!bzgc.f169909a.isEmpty()) {
                                            if ((((bzfr) bxwc2.get(i5)).f169859a & 1) != 0) {
                                                fvb a3 = fvb.m12459a();
                                                Context context2 = this.f17284d;
                                                bzfx bzfx2 = ((bzfr) bxwc2.get(i5)).f169860b;
                                                if (bzfx2 == null) {
                                                    bzfx2 = bzfx.f169887d;
                                                }
                                                String str10 = bzfx2.f169890b;
                                                String str11 = this.f17293m;
                                                a3.f17328a.lock();
                                                try {
                                                    SQLiteDatabase writableDatabase = fvc.m12461a(context2).getWritableDatabase();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("invitation_id", str10);
                                                    contentValues.put("operation_id", str11);
                                                    writableDatabase.insert("sms", null, contentValues);
                                                    reentrantLock = a3.f17328a;
                                                } catch (SQLiteException e) {
                                                    reentrantLock = a3.f17328a;
                                                } catch (Throwable th) {
                                                    a3.f17328a.unlock();
                                                    throw th;
                                                }
                                                reentrantLock.unlock();
                                                bzfg bzfg3 = bzgf.f169928c;
                                                if (bzfg3 == null) {
                                                    bzfg3 = bzfg.f169792f;
                                                }
                                                arrayList.add(bzfg3.f169798e);
                                                bzgc bzgc2 = ((bzfr) bxwc2.get(i5)).f169862d;
                                                if (bzgc2 == null) {
                                                    bzgc2 = bzgc.f169907b;
                                                }
                                                arrayList2.add(Html.fromHtml(bzgc2.f169909a).toString());
                                                bzfx bzfx3 = ((bzfr) bxwc2.get(i5)).f169860b;
                                                if (bzfx3 == null) {
                                                    bzfx3 = bzfx.f169887d;
                                                }
                                                arrayList3.add(bzfx3.f169890b);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (i3 < arrayList3.size()) {
                        Context context3 = this.f17284d;
                        fvv fvv = new fvv(context3.getApplicationContext());
                        fvv.f17384a = (String) arrayList.get(i3);
                        fvv.f17385b = (String) arrayList2.get(i3);
                        fvv.f17386c = (String) arrayList3.get(i3);
                        fvv.f17387d = this.f17285e;
                        fvv.f17388e = this.f17293m;
                        context3.startService(fvv.mo11405a());
                        i3++;
                    }
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.putExtra("appInviteResult", strArr);
                    intent.putExtra("appOperationCode", this.f17283a);
                    AppInviteIntentOperation.m6189a(this.f17283a, intent);
                    this.f17284d.sendBroadcast(intent);
                    return;
                }
                m12413a((Exception) null);
                return;
            }
        }
        bArr = null;
        i2 = 0;
        i = 0;
        try {
            fva fva2 = this.f17302v;
            String str32 = this.f17287g;
            String str42 = this.f17289i;
            String str52 = this.f17288h;
            String str62 = this.f17290j;
            Map map2 = this.f17291k;
            List list2 = this.f17294n;
            String str72 = this.f17292l;
            String str82 = this.f17295o;
            String str92 = this.f17296p;
            uri = this.f17297q;
            if (uri == null) {
            }
            a = fva2.mo11385a(clientContext, str32, str42, str52, null, str62, map2, null, null, list2, str72, str82, str92, str, bArr, i2, i, this.f17299s, this.f17300t, this.f17301u, this.f17293m);
            if (a == null) {
            }
        } catch (VolleyError | fup | gid e2) {
            m12413a(e2);
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        m12413a((Exception) null);
    }
}
