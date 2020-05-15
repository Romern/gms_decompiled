package com.google.android.gms.thunderbird.config.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.thunderbird.state.DeviceState;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmergencyConfigChimeraContentProvider extends ContentProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f109064a = 0;

    /* renamed from: b */
    private static final UriMatcher f109065b;

    /* renamed from: c */
    private aufz f109066c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f109065b = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.thunderbird.config", "mock", 1);
        f109065b.addURI("com.google.android.gms.thunderbird.config", "mock/*", 2);
        f109065b.addURI("com.google.android.gms.thunderbird.config", "real", 3);
        f109065b.addURI("com.google.android.gms.thunderbird.config", "real/*", 4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.lang.Iterable, augd]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    private final Iterable m93352a(Iterable iterable) {
        return cgyq.f188062a.mo6606a().mo84759c() ? bnjd.m109586b(iterable, (bmxz) new augd(DeviceState.m93365a(getContext()))) : iterable;
    }

    /* renamed from: b */
    private final void m93355b() {
        for (String str : augh.m77021a()) {
            getContext().enforceCallingPermission(str, null);
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        int size;
        m93355b();
        int match = f109065b.match(uri);
        if (match == 1) {
            aufz aufz = this.f109066c;
            Context context = getContext();
            synchronized (aufz.f91749a) {
                aufz.mo50504a(context);
                size = aufz.f91749a.size();
                if (auho.m77070a()) {
                    Log.d("Thunderbird", "clearing all mock configs");
                }
                aufz.f91749a.clear();
                aufz.mo50508c(context);
                aufz.mo50505a(augf.f91759a);
            }
            return size;
        } else if (match == 2) {
            String a = m93353a(uri, "mock");
            aufz aufz2 = this.f109066c;
            Context context2 = getContext();
            synchronized (aufz2.f91749a) {
                aufz2.mo50504a(context2);
                int i = 0;
                while (i < aufz2.f91749a.size()) {
                    if (!((aufq) aufz2.f91749a.get(i)).f91719a.equals(a)) {
                        i++;
                    } else {
                        if (auho.m77070a()) {
                            String valueOf = String.valueOf(a);
                            Log.d("Thunderbird", valueOf.length() == 0 ? new String("removing mock config: ") : "removing mock config: ".concat(valueOf));
                        }
                        aufz2.f91749a.remove(i);
                        aufz2.mo50508c(context2);
                        aufz2.mo50505a(augf.f91759a.buildUpon().appendPath(a).build());
                        return 1;
                    }
                }
                return 0;
            }
        } else {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 17);
            sb.append("Unsupported URI: ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("Real Configs:");
        for (aufq aufq : this.f109066c.mo50507b(getContext())) {
            String valueOf = String.valueOf(aufq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("  ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
        }
        printWriter.println("Mock Configs:");
        for (aufq aufq2 : this.f109066c.mo50504a(getContext())) {
            String valueOf2 = String.valueOf(aufq2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb2.append("  ");
            sb2.append(valueOf2);
            printWriter.println(sb2.toString());
        }
        printWriter.println("Flags:");
        Field[] fields = cgys.class.getFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    Object obj = field.get(null);
                    if (obj instanceof bdyx) {
                        bdyx bdyx = (bdyx) obj;
                        if (!bmxi.m108538a(bdyx.mo58455c(), bdyx.f106656e)) {
                            String b = bdyx.mo58453b();
                            String valueOf3 = String.valueOf(bdyx.mo58455c());
                            StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 5 + String.valueOf(valueOf3).length());
                            sb3.append("  ");
                            sb3.append(b);
                            sb3.append(" = ");
                            sb3.append(valueOf3);
                            printWriter.println(sb3.toString());
                        }
                    }
                } catch (IllegalAccessException e) {
                }
            }
        }
    }

    public final String getType(Uri uri) {
        int match = f109065b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.com.google.android.gms.thunderbird.config";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.com.google.android.gms.thunderbird.config";
        }
        if (match == 3) {
            return "vnd.android.cursor.dir/vnd.com.google.android.gms.thunderbird.config";
        }
        if (match != 4) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.com.google.android.gms.thunderbird.config";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        byte[] asByteArray;
        m93355b();
        if (f109065b.match(uri) != 1) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("Unsupported URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (contentValues == null || (asByteArray = contentValues.getAsByteArray("config_proto")) == null) {
            throw new IllegalArgumentException("No values provided");
        } else {
            try {
                auff auff = (auff) bxvk.m124014a(auff.f91640C, asByteArray);
                if (this.f109066c.mo50506a(getContext(), auff, false)) {
                    return uri.buildUpon().appendPath(auff.f91649b).build();
                }
                return null;
            } catch (IOException | ParseException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        }
    }

    public final boolean onCreate() {
        aufz a = aufz.m77007a();
        this.f109066c = a;
        a.registerObserver((ContentObserver) new auge(this, "thunderbird", "EmergencyConfigObserver"));
        return true;
    }

    public final void onTrimMemory(int i) {
        if (i >= 60) {
            aufz.m77008b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, augb]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, auga]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0112  */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        Iterable iterable;
        char c;
        Uri uri2 = uri;
        if (strArr != null) {
            strArr3 = strArr;
        } else {
            strArr3 = new String[0];
        }
        Context context = getContext();
        int match = f109065b.match(uri2);
        if (match == 1) {
            iterable = this.f109066c.mo50504a(context);
        } else if (match == 2) {
            iterable = bnjd.m109586b((Iterable) this.f109066c.mo50504a(context), (bmxz) new auga(m93353a(uri2, "mock")));
        } else if (match == 3) {
            m93354a();
            iterable = m93352a(this.f109066c.mo50507b(context));
        } else if (match == 4) {
            m93354a();
            iterable = m93352a(bnjd.m109586b((Iterable) this.f109066c.mo50507b(context), (bmxz) new augb(m93353a(uri2, "real"))));
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("Unsupported URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        bngx a = bngx.m109355a(iterable);
        MatrixCursor matrixCursor = new MatrixCursor(strArr3, a.size());
        List a2 = aufq.m76988a(a);
        Collections.sort(a2, augc.f91756a);
        int size = a2.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            auff auff = (auff) a2.get(i);
            int length = strArr3.length;
            Object[] objArr = new Object[length];
            int i2 = 0;
            for (String str3 : strArr3) {
                int hashCode = str3.hashCode();
                if (hashCode != 94650) {
                    if (hashCode == 539539115 && str3.equals("config_proto")) {
                        c = 1;
                        if (c == 0) {
                            objArr[i2] = Long.valueOf(j);
                        } else if (c != 1) {
                            String valueOf2 = String.valueOf(str3);
                            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unknown column: ") : "Unknown column: ".concat(valueOf2));
                        } else {
                            objArr[i2] = auff.mo73642k();
                        }
                        i2++;
                    }
                } else if (str3.equals("_id")) {
                    c = 0;
                    if (c == 0) {
                    }
                    i2++;
                }
                c = 65535;
                if (c == 0) {
                }
                i2++;
            }
            matrixCursor.addRow(objArr);
            j++;
        }
        matrixCursor.setNotificationUri(getContext().getContentResolver(), uri2);
        return matrixCursor;
    }

    public final void shutdown() {
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        byte[] asByteArray;
        m93355b();
        if (f109065b.match(uri) == 2) {
            String a = m93353a(uri, "mock");
            if (contentValues == null || (asByteArray = contentValues.getAsByteArray("config_proto")) == null) {
                throw new IllegalArgumentException("No values provided");
            }
            try {
                auff auff = (auff) bxvk.m124014a(auff.f91640C, asByteArray);
                if (!a.equals(auff.f91649b)) {
                    throw new IllegalArgumentException("Config name must match updated config name");
                } else if (this.f109066c.mo50506a(getContext(), auff, true)) {
                    return 1;
                } else {
                    return 0;
                }
            } catch (IOException | ParseException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("Unsupported URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static String m93353a(Uri uri, String str) {
        if (uri.getPath().length() > str.length() + 2) {
            return uri.getPath().substring(str.length() + 2);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Unsupported URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private final void m93354a() {
        int i = Build.VERSION.SDK_INT;
        if (!TextUtils.isEmpty(cgyq.m147645c()) && !sqc.m35963b(cgyq.m147645c().split(","), getCallingPackage())) {
            String callingPackage = getCallingPackage();
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(String.valueOf(callingPackage).length() + 69);
            sb.append("Permission Denial: ");
            sb.append(callingPackage);
            sb.append(" from pid=");
            sb.append(callingPid);
            sb.append(", uid=");
            sb.append(callingUid);
            sb.append(" not allowed");
            throw new SecurityException(sb.toString());
        }
    }
}
