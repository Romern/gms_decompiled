package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.service.LightweightIndexChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: acrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrd extends fth implements aaai {

    /* renamed from: l */
    private static int f60576l;

    /* renamed from: a */
    final acxo f60577a;

    /* renamed from: b */
    final abym f60578b;

    /* renamed from: c */
    final acxb f60579c;

    /* renamed from: d */
    final abyp f60580d;

    /* renamed from: e */
    final abxp f60581e;

    /* renamed from: f */
    final acwv f60582f;

    /* renamed from: g */
    final acwr f60583g;

    /* renamed from: h */
    final apne f60584h;

    /* renamed from: i */
    final rfz f60585i;

    /* renamed from: j */
    final acao f60586j;

    /* renamed from: k */
    final brhj f60587k;

    /* renamed from: m */
    private final LightweightIndexChimeraService f60588m;

    /* renamed from: n */
    private final Executor f60589n;

    /* renamed from: o */
    private final aaag f60590o;

    /* renamed from: p */
    private final String f60591p;

    /* renamed from: q */
    private final int f60592q;

    public acrd(LightweightIndexChimeraService lightweightIndexChimeraService, Executor executor, aaag aaag, String str, int i, acxo acxo, abym abym, acxb acxb, abyp abyp, abxp abxp, acwv acwv, acwr acwr, rfz rfz, acao acao, brhj brhj) {
        this.f60588m = lightweightIndexChimeraService;
        this.f60589n = executor;
        this.f60590o = aaag;
        this.f60591p = str;
        this.f60592q = i;
        this.f60577a = acxo;
        this.f60578b = abym;
        this.f60579c = acxb;
        this.f60580d = abyp;
        this.f60581e = abxp;
        this.f60582f = acwv;
        this.f60583g = acwr;
        this.f60584h = aplx.m70650b(lightweightIndexChimeraService);
        this.f60585i = rfz;
        this.f60586j = acao;
        this.f60587k = brhj;
        if (f60576l == 0) {
            int i2 = 0;
            try {
                PackageInfo packageInfo = this.f60588m.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 64);
                if (this.f60585i.mo24606a(packageInfo) && packageInfo.applicationInfo != null) {
                    i2 = packageInfo.applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            f60576l = i2;
        }
    }

    /* renamed from: a */
    private final String m49722a(bpzo bpzo) {
        bpzo bpzo2 = bpzo.CONTENT_UPDATE;
        int ordinal = bpzo.ordinal();
        if (ordinal == 3) {
            String str = this.f60591p;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("START[");
            sb.append(str);
            sb.append("]");
            return sb.toString();
        } else if (ordinal != 4) {
            return "UNKNOWN";
        } else {
            String str2 = this.f60591p;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 5);
            sb2.append("END[");
            sb2.append(str2);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    private final void m49723a(bpzo bpzo, bpzq bpzq, int i) {
        if (this.f60586j.mo32593a(this.f60586j.mo32592a())) {
            this.f60578b.mo32448a(this.f60591p, this.f60592q, bpzo, bpzq, i, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r2 = r4;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r2 = r4;
        r6 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[SYNTHETIC, Splitter:B:45:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7 A[SYNTHETIC, Splitter:B:53:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d7 A[SYNTHETIC, Splitter:B:60:0x00d7] */
    /* renamed from: a */
    private final void m49724a(ftl ftl, UsageInfo[] usageInfoArr, String str) {
        int i;
        if (usageInfoArr != null) {
            acwl.m49905a(this.f60588m, this.f60591p, usageInfoArr, str);
            LightweightIndexChimeraService lightweightIndexChimeraService = this.f60588m;
            String str2 = this.f60591p;
            long currentTimeMillis = System.currentTimeMillis();
            if (rfy.m33543a() || !((Boolean) abzt.f58875aP.mo58455c()).booleanValue()) {
                absg.m48201d("App history debug disabled.");
            } else {
                List a = acxm.m49954a(lightweightIndexChimeraService, currentTimeMillis);
                absg.m48201d("Not reporting usage and writing to app history debug file instead.");
                List<acqi> a2 = acwl.m49904a(lightweightIndexChimeraService, str2, a, usageInfoArr);
                synchronized (acwl.f60968a) {
                    if (new File(lightweightIndexChimeraService.getFilesDir(), "icing_app_history_debug").exists()) {
                        BufferedOutputStream bufferedOutputStream = null;
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(lightweightIndexChimeraService.openFileOutput("icing_app_history_debug", AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT));
                            try {
                                byte[] bArr = new byte[8192];
                                bxuk a3 = bxuk.m123637a(bArr);
                                i = 0;
                                for (acqi acqi : a2) {
                                    int i2 = acqi.f164961ai;
                                    if (i2 == -1) {
                                        i2 = bxxm.f165037a.mo74228a(acqi).mo74223b(acqi);
                                        acqi.f164961ai = i2;
                                    }
                                    a3.mo73855d(i2);
                                    acqi.mo73644a(a3);
                                    i++;
                                }
                                bufferedOutputStream2.write(bArr, 0, 8192 - a3.mo73827a());
                                try {
                                    bufferedOutputStream2.close();
                                } catch (IOException e) {
                                }
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                bufferedOutputStream = bufferedOutputStream2;
                                absg.m48190a(e, "Unable to create app history debug file.", new Object[0]);
                                if (bufferedOutputStream != null) {
                                }
                                absg.m48185a("Dumped %d app history events to debug file.", Integer.valueOf(i));
                                this.f60590o.mo16659a(this.f60588m, new acrg(ftl, this.f60584h, this.f60586j, this.f60577a, this.f60578b, usageInfoArr, this.f60591p));
                                return;
                            } catch (IOException e3) {
                                e = e3;
                                bufferedOutputStream = bufferedOutputStream2;
                                try {
                                    absg.m48190a(e, "Failed to write to app history debug file.", new Object[0]);
                                    if (bufferedOutputStream != null) {
                                    }
                                    absg.m48185a("Dumped %d app history events to debug file.", Integer.valueOf(i));
                                    this.f60590o.mo16659a(this.f60588m, new acrg(ftl, this.f60584h, this.f60586j, this.f60577a, this.f60578b, usageInfoArr, this.f60591p));
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    if (bufferedOutputStream != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                            }
                        } catch (FileNotFoundException e4) {
                            e = e4;
                            i = 0;
                            absg.m48190a(e, "Unable to create app history debug file.", new Object[0]);
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            absg.m48185a("Dumped %d app history events to debug file.", Integer.valueOf(i));
                            this.f60590o.mo16659a(this.f60588m, new acrg(ftl, this.f60584h, this.f60586j, this.f60577a, this.f60578b, usageInfoArr, this.f60591p));
                            return;
                        } catch (IOException e5) {
                            e = e5;
                            i = 0;
                            absg.m48190a(e, "Failed to write to app history debug file.", new Object[0]);
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            absg.m48185a("Dumped %d app history events to debug file.", Integer.valueOf(i));
                            this.f60590o.mo16659a(this.f60588m, new acrg(ftl, this.f60584h, this.f60586j, this.f60577a, this.f60578b, usageInfoArr, this.f60591p));
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e6) {
                                }
                            }
                            throw th;
                        }
                        absg.m48185a("Dumped %d app history events to debug file.", Integer.valueOf(i));
                    } else {
                        absg.m48184a("App history debug file doesn't exist.");
                    }
                }
            }
            this.f60590o.mo16659a(this.f60588m, new acrg(ftl, this.f60584h, this.f60586j, this.f60577a, this.f60578b, usageInfoArr, this.f60591p));
            return;
        }
        throw new IllegalArgumentException("null usageInfo");
    }

    /* renamed from: a */
    private final void m49725a(UsageInfo[] usageInfoArr) {
        cixk a;
        int i;
        boolean b = this.f60585i.mo24610b(this.f60591p);
        boolean booleanValue = ((Boolean) abzt.f58836D.mo58455c()).booleanValue();
        boolean a2 = this.f60586j.mo32593a(this.f60586j.mo32592a());
        if (!b && booleanValue && !a2) {
            absg.m48184a("Ignoring usage report: missing consent.");
            booleanValue = false;
        }
        if (b || booleanValue) {
            for (UsageInfo usageInfo : usageInfoArr) {
                if (usageInfo != null && ((i = usageInfo.f9696c) == 4 || i == 0 || i == 5)) {
                    this.f60582f.mo33180a(usageInfo, b);
                }
            }
        }
        this.f60583g.mo33176b();
        if (!this.f60583g.mo33175a()) {
            for (UsageInfo usageInfo2 : usageInfoArr) {
                String str = null;
                if (!(usageInfo2 == null || usageInfo2.f9698e == null || (a = fsi.m12248a("completionToken", usageInfo2)) == null)) {
                    cixn cixn = a.f191685c;
                    if (cixn == null) {
                        cixn = cixn.f191691g;
                    }
                    str = cixn.f191695c;
                }
                acwr acwr = this.f60583g;
                if (!(str == null || acwr.f60985b.get(str) == null)) {
                    LightweightIndexChimeraService lightweightIndexChimeraService = this.f60588m;
                    if (rfz.m33557a(lightweightIndexChimeraService).mo24610b("com.google.android.googlequicksearchbox")) {
                        lightweightIndexChimeraService.sendBroadcast(new Intent("com.google.android.gms.appindex.action.APPINDEX_CONTEXT_UPDATED").putExtra("com.google.android.gms.appindex.extra.COMPLETION_TOKEN", str).setPackage("com.google.android.googlequicksearchbox"));
                    }
                    acwr acwr2 = this.f60583g;
                    if (str != null) {
                        acwr2.f60985b.remove(str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m49726a() {
        return Binder.getCallingUid() == f60576l && "com.google.android.googlequicksearchbox".equals(this.f60591p);
    }

    /* renamed from: a */
    public final void mo11306a(GetRecentContextCall$Request getRecentContextCall$Request, ftl ftl) {
        if (m49726a() || spn.m35869b()) {
            this.f60590o.mo16659a(this.f60588m, new acqw(getRecentContextCall$Request, ftl, this.f60582f));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final void mo11307a(ftl ftl) {
        if (spn.m35869b()) {
            this.f60590o.mo16659a(this.f60588m, new acrb(ftl, this.f60577a));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final void mo11308a(ftl ftl, String str) {
        if (m49726a()) {
            try {
                acwr acwr = this.f60583g;
                String str2 = this.f60591p;
                long currentTimeMillis = System.currentTimeMillis();
                if (str != null) {
                    if (str2 != null) {
                        acwr.mo33176b();
                        acwr.f60985b.put(str, new acwq(currentTimeMillis));
                    }
                }
                ftl.mo11304a(Status.f30107a);
            } catch (RemoteException e) {
                absg.m48200c(e, "Client died during registerCompletionFilter", new Object[0]);
            }
        } else {
            throw new SecurityException("Access denied");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x018e A[SYNTHETIC, Splitter:B:107:0x018e] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0195 A[Catch:{ all -> 0x01fe, all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019c A[Catch:{ all -> 0x01fe, all -> 0x0213 }, LOOP:1: B:73:0x010e->B:111:0x019c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e7 A[Catch:{ all -> 0x01fe, all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015c A[SYNTHETIC, Splitter:B:91:0x015c] */
    /* renamed from: a */
    public final void mo11309a(ftl ftl, UsageInfo[] usageInfoArr) {
        boolean z;
        String str;
        absc absc;
        String str2;
        String str3;
        acrd acrd = this;
        ftl ftl2 = ftl;
        UsageInfo[] usageInfoArr2 = usageInfoArr;
        int i = 0;
        try {
            boolean b = acrd.f60585i.mo24610b(acrd.f60591p);
            int i2 = 1;
            if (cemw.f183016a.mo6606a().mo79371a()) {
                if (!b) {
                    abym abym = acrd.f60578b;
                    String str4 = acrd.f60591p;
                    long c = cema.m137236c();
                    if (abym.mo32452a(c)) {
                        bxvd da = bpxb.f139606R.mo74144da();
                        bxvd da2 = bpwu.f139575d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpwu bpwu = (bpwu) da2.f164949b;
                        str4.getClass();
                        bpwu.f139577a = 1 | bpwu.f139577a;
                        bpwu.f139578b = str4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpxb bpxb = (bpxb) da.f164949b;
                        bpwu bpwu2 = (bpwu) da2.mo74062i();
                        bpwu2.getClass();
                        bpxb.f139648x = bpwu2;
                        bpxb.f139625a |= 67108864;
                        abym.mo32438a(6017, da, c);
                        return;
                    }
                    return;
                }
            }
            LightweightIndexChimeraService lightweightIndexChimeraService = acrd.f60588m;
            String str5 = acrd.f60591p;
            int i3 = 0;
            while (i3 < usageInfoArr2.length) {
                UsageInfo usageInfo = usageInfoArr2[i3];
                if (usageInfo == null) {
                    z = b;
                } else {
                    if (usageInfo.f9696c == 3) {
                        usageInfo.f9701h = 2;
                        if (b) {
                            usageInfo.f9696c = 4;
                        } else {
                            usageInfo.f9696c = i;
                        }
                    }
                    if (usageInfo.f9701h == 0) {
                        usageInfo.f9701h = i2;
                    }
                    if (usageInfo != null) {
                        DocumentId documentId = usageInfo.f9694a;
                        if (documentId != null) {
                            String str6 = documentId.f9534a;
                            if (TextUtils.isEmpty(str6)) {
                                str = "No package name specified";
                            } else if (documentId.f9535b == null) {
                                str = "Null corpus name specified";
                            } else {
                                if (!b) {
                                    if (!str6.equals(str5)) {
                                        str = "Invalid package name provided in the app URL";
                                    }
                                }
                                str = absd.m48181d("Uri", documentId.f9536c, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            }
                            if (str != null) {
                                z = b;
                            } else if (usageInfo.f9695b >= 0) {
                                int i4 = usageInfo.f9696c;
                                if (i4 < 0) {
                                    z = b;
                                } else if (i4 <= 5) {
                                    DocumentContents documentContents = usageInfo.f9698e;
                                    if (documentContents != null) {
                                        Account account = documentContents.f9533d;
                                        if (account != null) {
                                            if (!soz.m35791a(lightweightIndexChimeraService, account)) {
                                                str = "Invalid account specified";
                                                z = b;
                                            }
                                        }
                                        DocumentSection[] documentSectionArr = documentContents.f9530a;
                                        int length = documentSectionArr.length;
                                        if (length <= 16) {
                                            int i5 = 0;
                                            boolean z2 = false;
                                            while (true) {
                                                if (i5 < length) {
                                                    DocumentSection documentSection = documentSectionArr[i5];
                                                    String a = documentSection.mo7175a();
                                                    if (a != null) {
                                                        z = b;
                                                        str = a;
                                                        break;
                                                    }
                                                    absc absc2 = absd.f58094b;
                                                    if ("name".equals(documentSection.f9544d.f9653h)) {
                                                        absc2 = absd.f58093a;
                                                    }
                                                    if (documentSection.f9545e != DocumentSection.f9541a) {
                                                        String a2 = fro.m12230a(documentSection.f9545e);
                                                        if (documentContents.f9532c) {
                                                            if (a2.equals("text1")) {
                                                                absc = absd.f58093a;
                                                                z2 = true;
                                                                if (!".private:action".equals(documentSection.f9544d.f9646a)) {
                                                                    try {
                                                                        z = b;
                                                                        try {
                                                                            if (((cixm) bxvk.m124016a(cixm.f191686d, documentSection.f9546f, bxus.m123744c())).f191690c.size() > 30) {
                                                                                str = "Too many action properties declared (max: 30)";
                                                                                Log.w("AppIndexApi", str);
                                                                                break;
                                                                            }
                                                                        } catch (bxwf e) {
                                                                            str = "Malformed action provided";
                                                                            if (str != null) {
                                                                            }
                                                                            i3++;
                                                                            acrd = this;
                                                                            b = z;
                                                                            i = 0;
                                                                            i2 = 1;
                                                                        }
                                                                    } catch (bxwf e2) {
                                                                        z = b;
                                                                        str = "Malformed action provided";
                                                                        if (str != null) {
                                                                        }
                                                                        i3++;
                                                                        acrd = this;
                                                                        b = z;
                                                                        i = 0;
                                                                        i2 = 1;
                                                                    }
                                                                } else {
                                                                    z = b;
                                                                }
                                                                str2 = documentSection.f9543c;
                                                                if (str2 != null) {
                                                                    str3 = absc.mo32334a("Contents", documentSection.f9546f);
                                                                } else {
                                                                    str3 = absc.mo32333a("Contents", str2);
                                                                }
                                                                if (str3 == null) {
                                                                    str = str3;
                                                                    break;
                                                                } else {
                                                                    i5++;
                                                                    b = z;
                                                                }
                                                            }
                                                        } else {
                                                            str = "Has global search fields but global search not enabled";
                                                            z = b;
                                                            break;
                                                        }
                                                    }
                                                    absc = absc2;
                                                    if (!".private:action".equals(documentSection.f9544d.f9646a)) {
                                                    }
                                                    str2 = documentSection.f9543c;
                                                    if (str2 != null) {
                                                    }
                                                    if (str3 == null) {
                                                    }
                                                } else {
                                                    z = b;
                                                    str = (documentContents.f9532c && !z2) ? "Global search enabled but no title or no data" : null;
                                                }
                                            }
                                        } else {
                                            str = "Too many sections";
                                            z = b;
                                        }
                                    } else {
                                        z = b;
                                        str = null;
                                    }
                                } else {
                                    z = b;
                                }
                                StringBuilder sb = new StringBuilder(27);
                                sb.append("Bad usage type: ");
                                sb.append(i4);
                                str = sb.toString();
                            } else {
                                z = b;
                                str = "Negative timestamp specified";
                            }
                        } else {
                            z = b;
                            str = "No document ID";
                        }
                    } else {
                        z = b;
                        str = "No usageInfo";
                    }
                    if (str != null) {
                        Log.w("AppIndexApi", "Received an invalid action.");
                        absg.m48207e("Ignoring usage report, got bad usage info: %s, clientPackageName: %s", str, str5);
                        usageInfoArr2[i3] = null;
                    }
                }
                i3++;
                acrd = this;
                b = z;
                i = 0;
                i2 = 1;
            }
            acrd.m49725a(usageInfoArr2);
            acrd.m49724a(ftl2, usageInfoArr2, "AppIndexApi");
        } catch (Throwable th) {
            absg.m48205e("Client died while providing callback.");
        }
    }

    /* renamed from: a */
    public final void mo11310a(ftl ftl, ActionImpl[] actionImplArr) {
        String str;
        bpzo bpzo;
        String str2;
        String str3;
        ftl ftl2 = ftl;
        ActionImpl[] actionImplArr2 = actionImplArr;
        bpzq bpzq = bpzq.NO_ERROR;
        String str4 = this.f60591p;
        acxb acxb = this.f60579c;
        if (actionImplArr2 == null) {
            throw new abws("Actions cannot be null.", bpzq.INVALID_ARGUMENT_NULL);
        } else if (actionImplArr2.length == 1) {
            ActionImpl actionImpl = actionImplArr2[0];
            if (actionImpl != null) {
                int i = actionImpl.f152345e.f152348a;
                if (i == 1) {
                    bpzo = bpzo.ACTION_START;
                } else if (i == 2) {
                    bpzo = bpzo.ACTION_END;
                } else {
                    throw new abws("EventStatus in Metadata is not supported.", actionImpl, bpzq.INVALID_ACTION_EVENT_STATUS);
                }
                String str5 = actionImpl.f152343c;
                if (str5 != null) {
                    try {
                        abyf.m48535a(str5);
                    } catch (IllegalArgumentException e) {
                        throw new abws(bpzo, e.getMessage(), actionImpl, bpzq.INVALID_ARGUMENT_URI, e);
                    } catch (IllegalArgumentException e2) {
                        IllegalArgumentException illegalArgumentException = e2;
                        throw new abws(bpzo, illegalArgumentException.getMessage(), actionImpl, bpzq.INVALID_INDEXABLE_INVALID_WEB_URL, illegalArgumentException);
                    } catch (acxa e3) {
                        throw new abws(bpzo, e3.getMessage(), actionImpl, bpzq.NO_PERMISSION);
                    } catch (abws e4) {
                        abws abws = e4;
                        bpzq bpzq2 = abws.f58647a;
                        String message = abws.getMessage();
                        try {
                            ActionImpl actionImpl2 = abws.f58649c;
                            if (actionImpl2 != null) {
                                String valueOf = String.valueOf(actionImpl2);
                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 24 + String.valueOf(valueOf).length());
                                sb.append(message);
                                sb.append(" The invalid action is: ");
                                sb.append(valueOf);
                                str = sb.toString();
                            } else {
                                str = message;
                            }
                            try {
                                absg.m48200c(abws, "%s failed", m49722a(abws.f58648b));
                                briy.m114097a(String.format("Invalid Action detected: %s", str));
                                this.f60581e.mo32415a(this.f60591p, abws.f58648b, bpzq2, abws.getMessage(), null, abws.f58649c);
                            } catch (Exception e5) {
                                e = e5;
                                message = str;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            this.f60580d.mo32456a("reportUserActions catch", e, cema.m137239f());
                            str = message;
                            mo33012a(ftl, actionImplArr, bpzq2, abws.f58648b, str);
                            return;
                        }
                        mo33012a(ftl, actionImplArr, bpzq2, abws.f58648b, str);
                        return;
                    }
                }
                if (!celu.m137199c()) {
                    String[] stringArray = actionImpl.f152347g.getStringArray("url");
                    if (stringArray != null && stringArray.length > 0 && !stringArray[0].isEmpty()) {
                        if (!stringArray[0].equals(str5)) {
                            throw new abws(bpzo, "Action and Object URLs must match.", actionImpl, bpzq.INVALD_ACTION_URL_MISMATCH);
                        }
                    }
                }
                String str6 = actionImpl.f152344d;
                if (str6 != null) {
                    abyf.m48536b(str6);
                }
                if (((Boolean) abzt.f58837E.mo58455c()).booleanValue()) {
                    str2 = acxb.m49919a(str5);
                    if (str2 != null) {
                        acxb.mo33184a(str4, str2);
                    }
                } else {
                    str2 = null;
                }
                abwt abwt = new abwt(bpzo, str2);
                String str7 = this.f60591p;
                if (!((Boolean) abzt.f58901ap.mo58455c()).booleanValue() || abzt.m48728b(str7)) {
                    mo33012a(ftl, actionImplArr, bpzq.NOT_ALLOWED, abwt.f58650a, null);
                    return;
                }
                ActionImpl actionImpl3 = actionImplArr2[0];
                if (celu.m137199c()) {
                    String str8 = this.f60591p;
                    abym abym = this.f60578b;
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme("appindex").authority(str8).path("action").appendQueryParameter("type", actionImpl3.f152341a).appendQueryParameter("object", actionImpl3.f152343c);
                    if (appendQueryParameter.toString().length() > 256) {
                        absg.m48203d("ActionUrl is too long and need to be hashed, callerPackageName : %s, actionType : %s.", str8, actionImpl3.f152341a);
                        abym.mo32447a("actions_rewrite_uri_too_long");
                        appendQueryParameter.clearQuery().appendQueryParameter("type", Long.toHexString(bnzi.m110905g().mo68721a(actionImpl3.f152341a, bmwy.f131158c).mo68742d())).appendQueryParameter("object", Long.toHexString(bnzi.m110905g().mo68721a(actionImpl3.f152343c, bmwy.f131158c).mo68742d()));
                    }
                    actionImpl3.f152347g.putStringArray("url", new String[]{appendQueryParameter.toString()});
                }
                ArrayList arrayList = new ArrayList();
                long currentTimeMillis = System.currentTimeMillis();
                absg.m48184a("Report Action");
                absg.m48184a(actionImpl3.toString());
                String str9 = abwt.f58651b;
                if (str9 == null) {
                    arrayList.add(abye.m48532a(actionImpl3, currentTimeMillis, this.f60591p));
                } else {
                    arrayList.add(abye.m48534b(actionImpl3, currentTimeMillis, str9));
                    if ("internal.3p:Message".equals(abwt.f58651b)) {
                        arrayList.add(abye.m48534b(actionImpl3, currentTimeMillis, "sms"));
                    }
                }
                UsageInfo[] usageInfoArr = (UsageInfo[]) arrayList.toArray(new UsageInfo[0]);
                m49725a(usageInfoArr);
                if (celu.m137201e()) {
                    absg.m48201d("Redirecting reportUserActions() to AppIndexService in main");
                    if (abwt.f58651b != null) {
                        str3 = "com.google.android.gms";
                    } else {
                        str3 = this.f60591p;
                    }
                    ((brin) this.f60587k).mo69566a(new MutateRequest(7, null, null, null, actionImplArr2[0], this.f60591p, str3)).mo50378a(this.f60589n, new acrc(this, ftl2, actionImplArr2, abwt));
                    m49723a(abwt.f58650a, bpzq.TEMPORARY_REDIRECT, 1);
                    return;
                }
                String a = m49722a(abwt.f58650a);
                try {
                    this.f60581e.mo32416a(this.f60591p, actionImpl3);
                    m49724a(ftl2, usageInfoArr, "FirebaseUserActions");
                } catch (Throwable th) {
                    absg.m48200c(th, "Error performing: %s", a);
                    bpzq bpzq3 = bpzq.INTERNAL_ERROR;
                    this.f60580d.mo32456a("reportUserActions INTERNAL_ERROR", th, cema.m137239f());
                    if (rfy.m33543a()) {
                        try {
                            ftl2.mo11304a(new Status(abxr.m48488a(bpzq3)));
                        } catch (RemoteException e7) {
                            absg.m48200c(e7, "Client died while providing callback for: %s", a);
                        }
                        bpzq = bpzq3;
                    } else {
                        throw th;
                    }
                }
                m49723a(abwt.f58650a, bpzq, actionImplArr2.length);
                return;
            }
            throw new abws("Action cannot be null.", bpzq.INVALID_ARGUMENT_NULL);
        } else {
            throw new abws("Providing more than one action in one start/end call is not allowed.", bpzq.INVALID_ARGUMENT_TOO_MANY);
        }
    }

    /* renamed from: a */
    public final void mo33012a(ftl ftl, ActionImpl[] actionImplArr, bpzq bpzq, bpzo bpzo, String str) {
        int i = 0;
        try {
            ftl.mo11304a(new Status(abxr.m48488a(bpzq), str));
        } catch (RemoteException e) {
            absg.m48200c(e, "Client died while providing callback for: %s", m49722a(bpzo));
        }
        if (actionImplArr != null) {
            i = actionImplArr.length;
        }
        m49723a(bpzo, bpzq, i);
    }
}
