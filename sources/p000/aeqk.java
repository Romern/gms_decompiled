package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import com.google.android.location.reporting.service.ReportingAndroidChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: aeqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqk extends dck implements aeql {

    /* renamed from: a */
    final /* synthetic */ ReportingAndroidChimeraService f63629a;

    /* renamed from: b */
    private final String f63630b;

    /* renamed from: c */
    private final String f63631c;

    public aeqk() {
        super("com.google.android.gms.location.reporting.internal.IReportingService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r1.equals(r2) == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128 A[Catch:{ RuntimeException -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130 A[Catch:{ RuntimeException -> 0x0138 }] */
    /* renamed from: a */
    private final int m52389a(OptInRequest optInRequest, boolean z) {
        String str;
        int i;
        this.f63629a.mo70903a();
        try {
            ReportingAndroidChimeraService reportingAndroidChimeraService = this.f63629a;
            String str2 = this.f63630b;
            String str3 = this.f63631c;
            if (!TextUtils.isEmpty(str3)) {
                if (TextUtils.isEmpty(str2)) {
                }
                StringBuilder sb = new StringBuilder();
                String str4 = optInRequest.f79598b;
                if (TextUtils.isEmpty(str4)) {
                    sb.append("notag");
                } else {
                    sb.append(str4);
                }
                sb.append("+");
                sb.append(str3);
                aept a = OptInRequest.m66974a(optInRequest.f79597a);
                a.f63614b = sb.toString();
                a.f63615c = optInRequest.f79599c;
                optInRequest = a.mo34445a();
            }
            bgyv a2 = bgyv.m100430a(reportingAndroidChimeraService);
            String str5 = this.f63630b;
            if ("com.google.android.gms".equals(str5)) {
                str = "com.google.android.gms+opt-in";
            } else {
                str = str5;
            }
            String str6 = optInRequest.f79598b;
            int i2 = 1;
            if (str6 != null) {
                if (str6.length() <= 100) {
                    String valueOf = String.valueOf(str);
                    String str7 = optInRequest.f79598b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str7).length());
                    sb2.append(valueOf);
                    sb2.append("+");
                    sb2.append(str7);
                    str = sb2.toString();
                } else {
                    i2 = 11;
                    if (!z) {
                        bgux.m100104c(this.f63630b, this.f63631c, i2);
                    } else {
                        bgux.m100099b(this.f63630b, this.f63631c, i2);
                    }
                    return i2;
                }
            }
            String str8 = optInRequest.f79599c;
            if (chcs.f188354a.mo6606a().mo85030S()) {
                if (bmxx.m108577a(str8)) {
                    i2 = 12;
                    if (!z) {
                    }
                    return i2;
                }
            }
            Account account = optInRequest.f79597a;
            if (account != null) {
                i = a2.mo63450b(a2.f118134a.mo63353a(account), str5);
            } else {
                i = 2;
            }
            if (i == 0) {
                bgyr a3 = bgys.m100417a(optInRequest.f79597a, str);
                a3.mo63439d();
                a3.f118109q = str8;
                a3.mo63440e();
                a3.f118099g = true;
                a3.f118100h = true;
                bgys a4 = a3.mo63432a();
                String valueOf2 = String.valueOf(str5);
                String str9 = valueOf2.length() == 0 ? new String("opt_in:") : "opt_in:".concat(valueOf2);
                bgye bgye = a2.f118134a;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 10);
                sb3.append("tryOptIn(");
                sb3.append(str);
                sb3.append(")");
                if (bgye.mo63357a(sb3.toString(), a4, str9)) {
                    i2 = 0;
                }
            } else {
                i2 = i;
            }
            if (!z) {
            }
            return i2;
        } catch (RuntimeException e) {
            bgur.m100021b("GCoreUlr", "original tryOptIn() exception (before parcelling)", e);
            if (z) {
                bgux.m100099b(this.f63630b, this.f63631c, -10000000);
            } else {
                bgux.m100104c(this.f63630b, this.f63631c, -10000000);
            }
            throw e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeqk(ReportingAndroidChimeraService reportingAndroidChimeraService, String str, String str2) {
        super("com.google.android.gms.location.reporting.internal.IReportingService");
        this.f63629a = reportingAndroidChimeraService;
        this.f63630b = str;
        this.f63631c = str2;
    }

    /* renamed from: a */
    public final int mo34459a(OptInRequest optInRequest) {
        return m52389a(optInRequest, false);
    }

    /* renamed from: a */
    public final ReportingState mo34460a(Account account) {
        this.f63629a.mo70903a();
        try {
            ReportingAndroidChimeraService reportingAndroidChimeraService = this.f63629a;
            AccountConfig a = reportingAndroidChimeraService.f150884a.mo63353a(account);
            bgyv a2 = bgyv.m100430a(reportingAndroidChimeraService);
            ReportingState a3 = a.mo70905a(a2.mo63450b(a, this.f63630b), a2.mo63449a(a, this.f63630b), bgzo.m100458a(chcs.f188354a.mo6606a().mo85113p()).contains(this.f63630b), bgzo.m100458a(chcs.f188354a.mo6606a().mo85056aR()).contains(this.f63630b));
            bgux.m100092a(this.f63630b, this.f63631c, 0);
            return a3;
        } catch (Exception e) {
            bgux.m100092a(this.f63630b, this.f63631c, -10000000);
            if (e instanceof RuntimeException) {
                bgur.m100021b("GCoreUlr", "original getReportingState() exception (before parcelling)", e);
                throw e;
            }
            bguz.m100120a(e);
            throw new RuntimeException("bad internal state");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d8 A[Catch:{ RuntimeException -> 0x0259 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x020e A[Catch:{ RuntimeException -> 0x0259 }] */
    /* renamed from: a */
    public final UploadRequestResult mo34461a(UploadRequest uploadRequest) {
        UploadRequestResult uploadRequestResult;
        String str;
        UploadRequest uploadRequest2;
        AccountConfig a;
        UploadRequest uploadRequest3 = uploadRequest;
        this.f63629a.mo70903a();
        try {
            ReportingAndroidChimeraService reportingAndroidChimeraService = this.f63629a;
            bgyd bgyd = new bgyd(reportingAndroidChimeraService, reportingAndroidChimeraService.f150884a, reportingAndroidChimeraService.f150885b);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str2 = this.f63630b;
            String valueOf = String.valueOf(uploadRequest);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 38 + String.valueOf(valueOf).length());
            sb.append("requestUpload(");
            sb.append(str2);
            sb.append(", ");
            sb.append(valueOf);
            sb.append(",");
            sb.append(elapsedRealtime);
            sb.append(")");
            bgur.m100011a("GCoreUlr", sb.toString());
            List a2 = bgzo.m100458a(chcs.m148231c());
            if (!a2.contains(str2)) {
                String valueOf2 = String.valueOf(uploadRequest);
                String valueOf3 = String.valueOf(a2);
                int length = String.valueOf(valueOf2).length();
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + String.valueOf(valueOf3).length());
                sb2.append(valueOf2);
                sb2.append(" for ");
                sb2.append(str2);
                sb2.append(" not in ");
                sb2.append(valueOf3);
                sb2.toString();
                uploadRequestResult = new UploadRequestResult(4, -1);
            } else if (uploadRequest3.f79615d >= 0 && uploadRequest3.f79616e >= 0 && uploadRequest3.f79614c >= 0) {
                long s = chcs.m148247s();
                if (uploadRequest3.f79614c > s) {
                    String valueOf4 = String.valueOf(uploadRequest);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 61);
                    sb3.append(valueOf4);
                    sb3.append(" duration too long, maximum allowed is ");
                    sb3.append(s);
                    sb3.append("ms");
                    sb3.toString();
                    uploadRequestResult = new UploadRequestResult(2, -1);
                } else {
                    int i = 0;
                    for (bgyt bgyt : bgyd.f117995c.mo63404c()) {
                        if (str2.equals(bgyt.f118133d)) {
                            i++;
                        }
                    }
                    if (((long) i) >= chcs.f188354a.mo6606a().mo85081aq()) {
                        uploadRequestResult = new UploadRequestResult(6, -1);
                    } else {
                        if (uploadRequest3.f79614c != 0) {
                            long av = chcs.f188354a.mo6606a().mo85086av();
                            long j = uploadRequest3.f79615d;
                            long j2 = uploadRequest3.f79616e;
                            if (j >= av) {
                                if (j2 >= av) {
                                    str = str2;
                                }
                            }
                            String valueOf5 = String.valueOf(uploadRequest);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 106);
                            sb4.append("Burst request accepted but latency is too low to be honored, it will be capped at ");
                            sb4.append(av);
                            sb4.append("ms: ");
                            sb4.append(valueOf5);
                            bgur.m100025c("GCoreUlr", sb4.toString());
                            str = str2;
                            aeqg a3 = UploadRequest.m66980a(uploadRequest3.f79612a, uploadRequest3.f79613b, uploadRequest3.f79614c);
                            a3.f63626d = Math.max(av, j);
                            a3.f63627e = Math.max(av, j2);
                            a3.f63628f = uploadRequest3.f79617f;
                            uploadRequest2 = a3.mo34454a();
                            a = bgyd.f117994b.mo63353a(uploadRequest2.f79612a);
                            if (!chdb.m148501b() && bgyh.m100364a(bgyd.f117993a).mo63411b()) {
                                bgur.m100011a("GCoreUlr", "Ulr is in private mode. requestUpload is disabled temporarily!");
                                uploadRequestResult = new UploadRequestResult(3, -1);
                            } else if (a.mo70916j()) {
                                String valueOf6 = String.valueOf(uploadRequest2);
                                String valueOf7 = String.valueOf(a);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 22 + String.valueOf(valueOf7).length());
                                sb5.append(valueOf6);
                                sb5.append(" for inactive account ");
                                sb5.append(valueOf7);
                                sb5.toString();
                                uploadRequestResult = new UploadRequestResult(3, -1);
                            } else {
                                bgyt a4 = bgyd.f117995c.mo63397a(uploadRequest2, null, elapsedRealtime, str);
                                Context context = bgyd.f117993a;
                                bgzo.m100465a(context, bgxx.m100271a(context, "com.google.android.location.reporting.ACTION_APPLY_UPLOAD_REQUESTS"));
                                uploadRequestResult = new UploadRequestResult(0, a4.f118130a);
                            }
                        } else {
                            str = str2;
                        }
                        uploadRequest2 = uploadRequest3;
                        a = bgyd.f117994b.mo63353a(uploadRequest2.f79612a);
                        if (!chdb.m148501b()) {
                        }
                        if (a.mo70916j()) {
                        }
                    }
                }
            } else {
                String valueOf8 = String.valueOf(uploadRequest);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf8).length() + 47);
                sb6.append("Burst request latency or duration is negative: ");
                sb6.append(valueOf8);
                sb6.toString();
                uploadRequestResult = new UploadRequestResult(5, -1);
            }
            bgux.m100093a(this.f63630b, this.f63631c, uploadRequest3, uploadRequestResult);
            return uploadRequestResult;
        } catch (RuntimeException e) {
            bgur.m100021b("GCoreUlr", "original requestUpload() exception (before parcelling)", e);
            bgux.m100093a(this.f63630b, this.f63631c, uploadRequest3, new UploadRequestResult(-10000000, -1));
            throw e;
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        bgyt bgyt;
        String str;
        int i2 = 4;
        int i3 = 0;
        switch (i) {
            case 1:
                ReportingState a = mo34460a((Account) dcl.m8163a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                break;
            case 2:
                int a2 = m52389a(OptInRequest.m66974a((Account) dcl.m8163a(parcel, Account.CREATOR)).mo34445a(), true);
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                break;
            case 3:
                UploadRequestResult a3 = mo34461a((UploadRequest) dcl.m8163a(parcel, UploadRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                break;
            case 4:
                long readLong = parcel.readLong();
                this.f63629a.mo70903a();
                try {
                    ReportingAndroidChimeraService reportingAndroidChimeraService = this.f63629a;
                    bgyd bgyd = new bgyd(reportingAndroidChimeraService, reportingAndroidChimeraService.f150884a, reportingAndroidChimeraService.f150885b);
                    String str2 = this.f63630b;
                    List a4 = bgzo.m100458a(chcs.m148231c());
                    if (!a4.contains(str2)) {
                        String valueOf = String.valueOf(a4);
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 43 + String.valueOf(valueOf).length());
                        sb.append(str2);
                        sb.append(" not in ");
                        sb.append(valueOf);
                        sb.append(", can't cancel ");
                        sb.append(readLong);
                        sb.toString();
                    } else {
                        bgyg bgyg = bgyd.f117995c;
                        synchronized (bgyg.f118028a) {
                            double d = (double) readLong;
                            synchronized (bgyg.f118028a) {
                                C1225nr nrVar = new C1225nr();
                                nrVar.addAll(bgyg.mo63404c());
                                Iterator it = nrVar.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        bgyt = (bgyt) it.next();
                                        if (((double) bgyt.f118130a) == d) {
                                        }
                                    } else {
                                        bgyt = null;
                                    }
                                }
                            }
                            if (bgyt != null) {
                                if (bgyg.mo63401a(Collections.singletonList(bgyt))) {
                                    bgxx.m100278b(bgyg.f118029b, "LocationReportingPreferences.removeUploadRequest");
                                }
                            }
                        }
                        i2 = bgyt == null ? 100 : 0;
                    }
                    bgux.m100109d(this.f63630b, this.f63631c, i2);
                    parcel2.writeNoException();
                    parcel2.writeInt(i2);
                    break;
                } catch (RuntimeException e) {
                    bgur.m100021b("GCoreUlr", "original cancelUploadRequest() exception (before parcelling)", e);
                    bgux.m100109d(this.f63630b, this.f63631c, -10000000);
                    throw e;
                }
            case 5:
                Account account = (Account) dcl.m8163a(parcel, Account.CREATOR);
                PlaceReport placeReport = (PlaceReport) dcl.m8163a(parcel, PlaceReport.CREATOR);
                this.f63629a.mo70903a();
                ReportingAndroidChimeraService reportingAndroidChimeraService2 = this.f63629a;
                bgzo.m100459a(reportingAndroidChimeraService2);
                bgxh bgxh = new bgxh(reportingAndroidChimeraService2, bgye.m100307a(reportingAndroidChimeraService2), bgzo.m100458a(chcs.f188354a.mo6606a().mo85049aK()));
                String str3 = this.f63630b;
                String valueOf2 = String.valueOf(placeReport);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 23 + String.valueOf(valueOf2).length());
                sb2.append("reportDeviceAtPlace(");
                sb2.append(str3);
                sb2.append(", ");
                sb2.append(valueOf2);
                sb2.append(")");
                sb2.toString();
                AccountConfig a5 = bgxh.f117913b.mo63353a(account);
                if (chdb.m148501b() && bgyh.m100364a(bgxh.f117912a).mo63411b()) {
                    bgur.m100011a("GCoreUlr", "Ulr is in private mode and reportPlace is disabled temporarily!");
                    i2 = 1;
                } else if (a5.mo70916j() && a5.f150896g) {
                    if (chcs.f188354a.mo6606a().mo85019H()) {
                        if (str3 == null) {
                            if (Log.isLoggable("GCoreUlr", 5)) {
                                Log.w("GCoreUlr", "calling package not specified");
                            }
                            i2 = 3;
                        } else if (!bgxh.f117914c.contains(str3)) {
                            if (Log.isLoggable("GCoreUlr", 5)) {
                                String valueOf3 = String.valueOf(bgxh.f117914c);
                                StringBuilder sb3 = new StringBuilder(str3.length() + 75 + String.valueOf(valueOf3).length());
                                sb3.append("package '");
                                sb3.append(str3);
                                sb3.append("' not in ");
                                sb3.append(valueOf3);
                                sb3.append("; contact gcore-ulr-eng@ to get your package whitelisted.");
                                Log.w("GCoreUlr", sb3.toString());
                            }
                        }
                    }
                    Context context = bgxh.f117912a;
                    Intent a6 = bgxx.m100271a(context, "com.google.android.location.reporting.ACTION_REPORT_PLACE");
                    a6.putExtra("account", account);
                    a6.putExtra("placeReport", placeReport);
                    a6.putExtra("placeReportCaller", str3);
                    bgzo.m100465a(context, a6);
                    i2 = 0;
                } else {
                    String valueOf4 = String.valueOf(placeReport);
                    String valueOf5 = String.valueOf(a5);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 22 + String.valueOf(valueOf5).length());
                    sb4.append(valueOf4);
                    sb4.append(" for inactive account ");
                    sb4.append(valueOf5);
                    sb4.toString();
                    i2 = 1;
                }
                String str4 = this.f63630b;
                String str5 = this.f63631c;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 58 + String.valueOf(str5).length());
                sb5.append("UlrClearcutEvents.logApiCallReportPlace('");
                sb5.append(str4);
                sb5.append("', '");
                sb5.append(str5);
                sb5.append(", ");
                sb5.append(i2);
                sb5.toString();
                if (bgux.m100096a() && bgux.m100102b()) {
                    bgux.f117614a.mo63243a(bvyy.AC_REPORT_PLACE, str4, str5, i2);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case 6:
                int a7 = mo34459a((OptInRequest) dcl.m8163a(parcel, OptInRequest.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(a7);
                break;
            case 7:
                Account account2 = (Account) dcl.m8163a(parcel, Account.CREATOR);
                SendDataRequest sendDataRequest = (SendDataRequest) dcl.m8163a(parcel, SendDataRequest.CREATOR);
                this.f63629a.mo70903a();
                try {
                    ReportingAndroidChimeraService reportingAndroidChimeraService3 = this.f63629a;
                    bgzo.m100459a(reportingAndroidChimeraService3);
                    bgyy bgyy = new bgyy(reportingAndroidChimeraService3, bgye.m100307a(reportingAndroidChimeraService3), bgzo.m100458a(chcs.f188354a.mo6606a().mo85053aO()));
                    String str6 = this.f63630b;
                    String valueOf6 = String.valueOf(sendDataRequest);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 12 + String.valueOf(valueOf6).length());
                    sb6.append("sendData(");
                    sb6.append(str6);
                    sb6.append(", ");
                    sb6.append(valueOf6);
                    sb6.append(")");
                    sb6.toString();
                    AccountConfig a8 = bgyy.f118141b.mo63353a(account2);
                    if (!chdb.m148501b() || !bgyh.m100364a(bgyy.f118140a).mo63411b()) {
                        if (a8.mo70916j()) {
                            if (a8.f150896g) {
                                if (str6 == null) {
                                    Log.w("GCoreUlr", "calling package not specified");
                                    i3 = 8;
                                } else if (!bgyy.f118142c.contains(str6)) {
                                    String valueOf7 = String.valueOf(bgyy.f118142c);
                                    StringBuilder sb7 = new StringBuilder(str6.length() + 75 + String.valueOf(valueOf7).length());
                                    sb7.append("package '");
                                    sb7.append(str6);
                                    sb7.append("' not in ");
                                    sb7.append(valueOf7);
                                    sb7.append("; contact gcore-ulr-eng@ to get your package whitelisted.");
                                    Log.w("GCoreUlr", sb7.toString());
                                    i3 = 3500;
                                } else {
                                    Context context2 = bgyy.f118140a;
                                    Intent a9 = bgxx.m100271a(context2, "com.google.android.location.reporting.ACTION_SEND_DATA");
                                    a9.putExtra("account", account2);
                                    a9.putExtra("caller", str6);
                                    sef.m35071a(sendDataRequest, a9, "request");
                                    bgzo.m100465a(context2, a9);
                                }
                            }
                        }
                        String valueOf8 = String.valueOf(sendDataRequest);
                        String valueOf9 = String.valueOf(a8);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 22 + String.valueOf(valueOf9).length());
                        sb8.append(valueOf8);
                        sb8.append(" for inactive account ");
                        sb8.append(valueOf9);
                        sb8.toString();
                        i3 = 3504;
                    } else {
                        bgur.m100011a("GCoreUlr", "Ulr is in private mode. sendData is disabled temporarily!");
                        i3 = 3504;
                    }
                    bgux.m100114e(this.f63630b, this.f63631c, i3);
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                } catch (RuntimeException e2) {
                    bgur.m100021b("GCoreUlr", "original sendData() exception (before parcelling)", e2);
                    bgux.m100114e(this.f63630b, this.f63631c, -10000000);
                    throw e2;
                }
                break;
            case 8:
                UlrPrivateModeRequest ulrPrivateModeRequest = (UlrPrivateModeRequest) dcl.m8163a(parcel, UlrPrivateModeRequest.CREATOR);
                this.f63629a.mo70903a();
                ReportingAndroidChimeraService reportingAndroidChimeraService4 = this.f63629a;
                int a10 = bgyw.m100433a(reportingAndroidChimeraService4).mo63451a(reportingAndroidChimeraService4, this.f63630b, ulrPrivateModeRequest);
                String str7 = this.f63630b;
                String str8 = this.f63631c;
                boolean z = ulrPrivateModeRequest.f79611b;
                bguw bguw = bgux.f117614a;
                if (!z) {
                    str = "Off";
                } else {
                    str = "On";
                }
                StringBuilder sb9 = new StringBuilder(str.length() + 64 + String.valueOf(str7).length() + String.valueOf(str8).length());
                sb9.append("UlrClearcutEvents.logApiCallPrivateModeToggle");
                sb9.append(str);
                sb9.append("(");
                sb9.append(str7);
                sb9.append("', '");
                sb9.append(str8);
                sb9.append(", ");
                sb9.append(a10);
                sb9.append(")");
                sb9.toString();
                if (bgux.f117614a != null && chcd.f188319a.mo6606a().mo84983b()) {
                    if (!z) {
                        bgux.f117614a.mo63243a(bvyy.AC_PRIVATE_MODE_TOGGLE_OFF, str7, str8, a10);
                    } else {
                        bgux.f117614a.mo63243a(bvyy.AC_PRIVATE_MODE_TOGGLE_ON, str7, str8, a10);
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(a10);
                break;
            default:
                return false;
        }
        return true;
    }
}
