package com.google.android.location.reporting.server;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.ulr.ApiSettings;
import com.google.android.ulr.DeleteApiLocationsReply;
import com.google.android.ulr.DeleteApiLocationsRequest;
import java.io.IOException;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeleteHistoryIntentOperation extends IntentOperation {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwd.a(java.lang.String, boolean):bxvd
     arg types: [java.lang.String, int]
     candidates:
      bgwd.a(android.content.Context, android.accounts.Account):com.google.android.gms.common.internal.ClientContext
      bgwd.a(java.lang.String, boolean):bxvd */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029b, code lost:
        r5 = r0;
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c3, code lost:
        r2 = r26;
        r4 = r27;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        p000.bgux.m100101b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cc, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d0, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d6, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02dc, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e2, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e8, code lost:
        r2 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ed, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r1.mo63300a(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02f2, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02fa, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02fe, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c8, code lost:
        r1 = r0;
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01da, code lost:
        r5 = r0;
        r2 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x01c6, B:108:0x027f] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x01c6, B:85:0x01ea, B:87:0x01ec, B:132:0x02c9] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x01c6, B:85:0x01ea] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cf A[ExcHandler: all (th java.lang.Throwable), PHI: r26 r27 10  PHI: (r26v3 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:85:0x01ea, B:86:?, B:87:0x01ec] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r27v3 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:85:0x01ea, B:86:?, B:87:0x01ec] A[DONT_GENERATE, DONT_INLINE], Splitter:B:85:0x01ea] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d5 A[ExcHandler: IOException (e java.io.IOException), PHI: r26 r27 10  PHI: (r26v2 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v12 android.os.Messenger), (r26v12 android.os.Messenger) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:87:0x01ec, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r27v2 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v11 android.os.Message), (r27v11 android.os.Message) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:87:0x01ec, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02db A[ExcHandler: chuw (e chuw), PHI: r26 r27 10  PHI: (r26v1 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v12 android.os.Messenger), (r26v12 android.os.Messenger) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r27v1 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v11 android.os.Message), (r27v11 android.os.Message) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02fd A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0308 A[ExcHandler: chuw (e chuw), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c A[Catch:{ gid -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1 A[Catch:{ gid -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bb A[Catch:{ gid -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c0 A[Catch:{ gid -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7 A[ExcHandler: all (r0v24 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r26 r27 10  PHI: (r26v6 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v12 android.os.Messenger), (r26v12 android.os.Messenger) binds: [B:108:0x027f, B:109:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r27v6 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v11 android.os.Message), (r27v11 android.os.Message) binds: [B:108:0x027f, B:109:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x01c6] */
    public final void onHandleIntent(Intent intent) {
        Messenger messenger;
        bgwx bgwx;
        Message message;
        Messenger messenger2;
        bgwb bgwb;
        bgwx bgwx2;
        String str;
        bgzo.m100459a(this);
        bgwx a = bgwx.m100189a(this);
        Account account = (Account) intent.getParcelableExtra("account");
        Messenger messenger3 = (Messenger) intent.getParcelableExtra("messenger");
        Message obtain = Message.obtain();
        obtain.what = 0;
        try {
            int b = a.f117871a.mo63359b(account);
            String a2 = a.mo63298a(account);
            if (!chcp.m148196e()) {
                bgwl bgwl = a.f117872b;
                DeleteApiLocationsRequest deleteApiLocationsRequest = new DeleteApiLocationsRequest(bgwl.mo63280a());
                bgwr a3 = bgwk.m100163a(bgwl.f117827i);
                try {
                    bjcx bjcx = new bjcx(a3);
                    ClientContext a4 = bgwl.m100164a(bgwl.f117827i, account);
                    a3.f117860m = bgwj.f117825a;
                    Integer valueOf = Integer.valueOf(b);
                    String str2 = bgwl.f117809f;
                    String str3 = bgwl.f117807d;
                    String str4 = bgwl.f117806c;
                    Integer valueOf2 = Integer.valueOf(bgwl.f117828j);
                    Boolean bool = bgwl.f117832n;
                    String str5 = bgwl.f117811h;
                    String str6 = bgwl.f117810g;
                    Integer valueOf3 = Integer.valueOf(bgwl.f117830l);
                    Integer valueOf4 = Integer.valueOf(bgwl.f117804a);
                    Integer valueOf5 = Integer.valueOf(bgwl.f117829k);
                    String str7 = bgwl.f117805b;
                    if (chcj.m148167e()) {
                        str = "android";
                    } else {
                        str = null;
                    }
                    String str8 = bgwl.f117808e;
                    DeleteApiLocationsRequest deleteApiLocationsRequest2 = deleteApiLocationsRequest;
                    StringBuilder sb = new StringBuilder();
                    messenger2 = messenger3;
                    try {
                        bgwx2 = a;
                        message = obtain;
                    } catch (gid e) {
                        e = e;
                        gid gid = e;
                        if (!chcy.m148488d()) {
                        }
                        throw gid;
                    } catch (VolleyError e2) {
                        e = e2;
                        bgwx2 = a;
                        message = obtain;
                        VolleyError volleyError = e;
                        if (!chcy.m148488d()) {
                        }
                        bgwl.m100165a(volleyError);
                        throw new IOException(volleyError);
                    } catch (Throwable th) {
                        th = th;
                        bgwx2 = a;
                        message = obtain;
                        try {
                            throw th;
                        } catch (gid e3) {
                            gid gid2 = e3;
                            messenger = messenger2;
                            obtain = message;
                            bgwx = bgwx2;
                        } catch (chuw e4) {
                        } catch (IOException e5) {
                        } catch (Throwable th2) {
                        }
                    }
                    try {
                        new Formatter(sb).format("deletes/%1$s", String.valueOf(valueOf));
                        if (a2 != null) {
                            shd.m35269a(sb, "androidGcmRegistrationId", shd.m35267a(a2));
                        }
                        if (str2 != null) {
                            shd.m35269a(sb, "brand", shd.m35267a(str2));
                        }
                        if (str3 != null) {
                            shd.m35269a(sb, "device", shd.m35267a(str3));
                        }
                        if (str4 != null) {
                            shd.m35269a(sb, "devicePrettyName", shd.m35267a(str4));
                        }
                        shd.m35269a(sb, "deviceRestriction", shd.m35267a("noRestriction"));
                        shd.m35269a(sb, "gmsVersion", String.valueOf(valueOf2));
                        if (bool != null) {
                            shd.m35269a(sb, "isLowRam", String.valueOf(bool));
                        }
                        if (str5 != null) {
                            shd.m35269a(sb, "manufacturer", shd.m35267a(str5));
                        }
                        if (str6 != null) {
                            shd.m35269a(sb, "model", shd.m35267a(str6));
                        }
                        shd.m35269a(sb, "moduleVersion", String.valueOf(valueOf3));
                        shd.m35269a(sb, "nlpVersion", String.valueOf((Object) 2023));
                        shd.m35269a(sb, "osLevel", String.valueOf(valueOf4));
                        shd.m35269a(sb, "packageVersion", String.valueOf(valueOf5));
                        if (str7 != null) {
                            shd.m35269a(sb, "platform", shd.m35267a(str7));
                        }
                        if (str != null) {
                            shd.m35269a(sb, "platformType", shd.m35267a(str));
                        }
                        if (str8 != null) {
                            shd.m35269a(sb, BuildConfig.FLAVOR_mode, shd.m35267a(str8));
                        }
                        ApiSettings settings = ((DeleteApiLocationsReply) bjcx.f122527a.mo25536a(a4, 1, sb.toString(), deleteApiLocationsRequest2, DeleteApiLocationsReply.class)).getSettings();
                        bgux.m100101b(true);
                        bgwb = bgwb.m100151a(account, settings);
                        bgwx = bgwx2;
                    } catch (gid e6) {
                        e = e6;
                        gid gid3 = e;
                        if (!chcy.m148488d()) {
                            bgux.m100101b(false);
                        } else {
                            bgux.m100094a(gid3);
                        }
                        throw gid3;
                    } catch (VolleyError e7) {
                        e = e7;
                        VolleyError volleyError2 = e;
                        if (!chcy.m148488d()) {
                            bgux.m100101b(false);
                        } else {
                            bgux.m100094a(volleyError2);
                        }
                        bgwl.m100165a(volleyError2);
                        throw new IOException(volleyError2);
                    }
                } catch (gid e8) {
                    e = e8;
                    gid gid32 = e;
                    if (!chcy.m148488d()) {
                    }
                    throw gid32;
                } catch (VolleyError e9) {
                    e = e9;
                    messenger2 = messenger3;
                    bgwx2 = a;
                    message = obtain;
                    VolleyError volleyError22 = e;
                    if (!chcy.m148488d()) {
                    }
                    bgwl.m100165a(volleyError22);
                    throw new IOException(volleyError22);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } else {
                messenger2 = messenger3;
                message = obtain;
                bgwx = a;
                bgwd bgwd = bgwx.f117873c;
                bxvd da = bvyb.f158129d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyb bvyb = (bvyb) da.f164949b;
                bvyb.f158131a |= 1;
                bvyb.f158132b = b;
                bvwb bvwb = (bvwb) bgwd.mo63278a(a2, true).mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvyb bvyb2 = (bvyb) da.f164949b;
                bvwb.getClass();
                bvyb2.f158133c = bvwb;
                bvyb2.f158131a |= 2;
                bvyb bvyb3 = (bvyb) da.mo74062i();
                bgux.m100088a(0L);
                bgwz bgwz = bgwd.f117812j;
                ClientContext a5 = bgwd.m100154a(bgwd.f117813i, account);
                if (bgwz.f117881g == null) {
                    bgwz.f117881g = chtv.m149566a(chtu.UNARY, "userlocation.UserLocationReportingService/DeleteApiLocations", ciie.m150370a(bvyb.f158129d), ciie.m150370a(bvya.f158125b));
                }
                bgux.m100101b(true);
                bvxn bvxn = ((bvya) bgwz.f117882a.mo25553a(bgwz.f117881g, a5, bvyb3, 10000, TimeUnit.MILLISECONDS)).f158127a;
                if (bvxn == null) {
                    bvxn = bvxn.f158064j;
                }
                bgwb = bgwb.m100150a(account, bvxn);
            }
            if (bgwx.m100191b(bgwb)) {
                bgwx.mo63299a(account, a2);
                bgwx.mo63301a(bgwb);
                bgyh bgyh = bgwx.f117871a.f118000b;
                String f = bgyh.m100369f(account);
                SharedPreferences.Editor edit = bgyh.f118032a.edit();
                edit.remove(f);
                edit.apply();
            }
            bgwx.mo63300a(account, true);
            obtain = message;
            try {
                obtain.what = 1;
                try {
                    messenger2.send(obtain);
                } catch (RemoteException e10) {
                }
            } catch (chuw | gid e11) {
                messenger = messenger2;
                obtain.what = 2;
                try {
                    messenger.send(obtain);
                } catch (RemoteException e12) {
                }
            } catch (IOException e13) {
                messenger = messenger2;
                try {
                    obtain.what = 3;
                    try {
                        messenger.send(obtain);
                    } catch (RemoteException e14) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    try {
                        messenger.send(obtain);
                    } catch (RemoteException e15) {
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                messenger = messenger2;
                Throwable th52 = th;
                messenger.send(obtain);
                throw th52;
            }
        } catch (gid e16) {
            messenger = messenger3;
            obtain.what = 2;
            messenger.send(obtain);
        } catch (chuw e17) {
        } catch (IOException e18) {
        } catch (Throwable th7) {
        }
    }
}
