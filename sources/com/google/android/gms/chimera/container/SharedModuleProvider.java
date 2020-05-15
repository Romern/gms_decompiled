package com.google.android.gms.chimera.container;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.UserManager;
import android.util.Log;
import java.io.File;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SharedModuleProvider extends ContentProvider {

    /* renamed from: a */
    private UserManager f29982a = null;

    /* renamed from: b */
    private Context f29983b;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        return null;
     */
    public final synchronized Bundle call(String str, String str2, Bundle bundle) {
        if (!cdjh.m133552b()) {
            if (cdjh.m133558h()) {
            }
        }
        UserManager userManager = this.f29982a;
        if (userManager != null) {
            long serialNumberForUser = userManager.getSerialNumberForUser(Binder.getCallingUserHandle());
            if (!"exchangeInfo".equals(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
                sb.append("Unknown method call: ");
                sb.append(str);
                sb.append(" from user ");
                sb.append(serialNumberForUser);
                Log.e("SharedModuleProvider", sb.toString());
                return null;
            } else if (bundle == null) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("null bundle input from user ");
                sb2.append(serialNumberForUser);
                Log.e("SharedModuleProvider", sb2.toString());
                return null;
            } else {
                byte[] byteArray = bundle.getByteArray("UpdateRequest");
                if (byteArray != null) {
                    try {
                        qnx a = qnv.m32530a(this.f29983b).mo24141a((qnx) GeneratedMessageLite.m124016a(qnx.f41814d, byteArray, bxus.m123743b()), serialNumberForUser);
                        if (a == null) {
                            return null;
                        }
                        byte[] byteArray2 = bundle.getByteArray("UrgentFeatures");
                        if (byteArray2 != null) {
                            this.f29983b.startService(dgf.m8387a(this.f29983b, byteArray2, null, null));
                        }
                        bundle.clear();
                        bundle.putByteArray("UpdateRequest", a.mo73642k());
                        return bundle;
                    } catch (bxwf e) {
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 61);
                        sb3.append("error parsing update request from user ");
                        sb3.append(serialNumberForUser);
                        sb3.append(": ");
                        sb3.append(message);
                        Log.e("SharedModuleProvider", sb3.toString());
                        return null;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(50);
                    sb4.append("null module request from user ");
                    sb4.append(serialNumberForUser);
                    Log.e("SharedModuleProvider", sb4.toString());
                }
            }
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        bmzs.m108696a(context);
        this.f29983b = context;
        int i = Build.VERSION.SDK_INT;
        this.f29982a = (UserManager) context.getSystemService("user");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String path;
        dhs dhs;
        bnhe e = dgv.m8427a(this.f29983b).mo8987e();
        if (!(e == null || (path = uri.getPath()) == null)) {
            Uri parse = Uri.parse(path.substring(1));
            if ("moduleapk-identifier".equals(parse.getScheme())) {
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments.size() == 2) {
                    dhs = new dhs(pathSegments.get(0), pathSegments.get(1));
                    if (e.containsKey(dhs)) {
                        return ParcelFileDescriptor.open(new File((String) e.get(dhs)), 268435456);
                    }
                }
            }
            dhs = null;
            if (e.containsKey(dhs)) {
            }
        }
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
