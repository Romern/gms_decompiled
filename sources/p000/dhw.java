package p000;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: dhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dhw extends ContentProvider {

    /* renamed from: a */
    public static final UriMatcher f13192a;

    /* renamed from: c */
    public static final Comparator f13193c = dhu.f13190a;

    /* renamed from: b */
    public Context f13194b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13192a = uriMatcher;
        uriMatcher.addURI("*", "features", 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final djz mo9032a() {
        dfy a = dfy.m8329a(this.f13194b);
        try {
            return a.mo8898f();
        } catch (InvalidConfigException e) {
            mo9033b();
            try {
                return a.mo8898f();
            } catch (InvalidConfigException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Module config not available yet: ");
                sb.append(valueOf);
                Log.w("ModuleProvider", sb.toString());
                return null;
            }
        }
    }

    /* renamed from: b */
    public abstract void mo9033b();

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkt.a(djz, java.util.Collection):java.util.List
     arg types: [djz, java.util.List]
     candidates:
      dkt.a(djz, java.util.List):int
      dkt.a(djz, byte[]):int
      dkt.a(djz, java.util.Collection):java.util.List */
    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        String string;
        List list;
        bxwc bxwc;
        String str3;
        String str4 = str;
        Bundle bundle2 = bundle;
        int i = 1;
        switch (str.hashCode()) {
            case -1102730960:
                if (str4.equals("featureCheckCall")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -399917498:
                if (str4.equals("feature_request")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -135988305:
                if (str4.equals("serviceIntentCall")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1556259298:
                if (str4.equals("featureFetchCall")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        byte[] bArr = null;
        if (c == 0) {
            Bundle bundle3 = new Bundle();
            if (bundle2 != null) {
                bArr = bundle2.getByteArray("featuresBundleKey");
            }
            if (bArr == null) {
                Log.e("ModuleProvider", "Missing extras key: featureCheckCall");
                bundle3.putInt("featuresResult", 3);
            } else {
                djz a = mo9032a();
                if (a == null) {
                    Log.e("ModuleProvider", "An error occurred while trying to load the container features. All client api feature requests will fail.");
                    bundle3.putInt("featuresResult", 3);
                } else {
                    int a2 = dkt.m8752a(a, bArr);
                    if (a2 != 2) {
                        i = a2;
                    }
                    bundle3.putInt("featuresResult", i);
                }
            }
            return bundle3;
        } else if (c == 1) {
            Bundle bundle4 = new Bundle();
            if (bundle2 == null) {
                Log.e("ModuleProvider", "Missing extras bundle");
                bundle4.putInt("featuresResult", 3);
            } else {
                String[] stringArray = bundle2.getStringArray("featureNamesBundleKey");
                if (stringArray == null || stringArray.length == 0) {
                    Log.e("ModuleProvider", "Missing feature names to fetch for key: featureNamesBundleKey");
                    bundle4.putInt("featuresResult", 3);
                } else {
                    djz a3 = mo9032a();
                    if (a3 == null) {
                        Log.e("ModuleProvider", "An error occurred while trying to load the container features. All client api feature requests will fail.");
                        bundle4.putInt("featuresResult", 3);
                    } else {
                        List a4 = dkt.m8754a(a3, (Collection) Arrays.asList(stringArray));
                        bxvd da = djf.f13322b.mo74144da();
                        da.mo74065i(a4);
                        bundle4.putByteArray("featuresResponseListKey", ((djf) da.mo74062i()).serializeToBytes());
                        bundle4.putInt("featuresResult", 0);
                    }
                }
            }
            return bundle4;
        } else if (c != 2) {
            if (c != 3) {
                return null;
            }
            if (bundle2 != null) {
                str3 = bundle2.getString("serviceActionBundleKey");
            } else {
                str3 = null;
            }
            if (str3 == null) {
                Log.e("ModuleProvider", "Missing action in extras: serviceIntentCall");
            } else {
                djz a5 = mo9032a();
                if (a5 != null) {
                    brtm f = a5.mo9181f();
                    String E = f.mo69896E();
                    dmy d = f.mo69924d(dmv.m8834a(E, str3));
                    if (d != null) {
                        Intent className = new Intent(str3).setPackage(this.f13194b.getPackageName()).setClassName(this.f13194b, dmv.m8840b(E, d.mo9291c()));
                        Bundle bundle5 = new Bundle();
                        bundle5.putParcelable("serviceResponseIntentKey", className);
                        return bundle5;
                    }
                }
            }
            return null;
        } else if (Binder.getCallingUid() != Process.myUid()) {
            Log.e("ModuleProvider", "requesting feature from outside of GmsCore is not supported");
            return null;
        } else if (bundle2 == null || (string = bundle2.getString("requester")) == null) {
            return null;
        } else {
            List stringArrayList = bundle2.getStringArrayList("unrequested");
            if (stringArrayList == null) {
                list = Collections.emptyList();
            } else {
                list = stringArrayList;
            }
            boolean z = bundle2.getBoolean("forceUnrequest");
            boolean z2 = bundle2.getBoolean("urgent");
            djk a6 = dkz.m8773a(bundle2, "listener");
            String string2 = bundle2.getString("sessionId");
            List emptyList = Collections.emptyList();
            byte[] byteArray = bundle2.getByteArray("requested");
            if (byteArray != null) {
                try {
                    bxwc = ((dje) GeneratedMessageLite.m124016a(dje.f13319b, byteArray, bxus.m123743b())).f13321a;
                } catch (bxwf e) {
                    Log.e("ModuleProvider", "Malformed requested features");
                    return null;
                }
            } else {
                bxwc = emptyList;
            }
            boolean a7 = dgh.m8389a(this.f13194b).mo8952a(string, bxwc, list, z, z2, a6, string2, null);
            Bundle bundle6 = new Bundle();
            bundle6.putBoolean("result", a7);
            return bundle6;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        djz djz;
        String str2;
        dhw dhw = this;
        PrintWriter printWriter2 = printWriter;
        dfy a = dfy.m8329a(dhw.f13194b);
        try {
            djz f = a.mo8898f();
            dky c = a.mo8895c(f);
            printWriter2.println("Module Sets:");
            int size = c.size();
            int i = 0;
            while (true) {
                str = "  ";
                if (i >= size) {
                    break;
                }
                bojy bojy = (bojy) c.get(i);
                StringBuilder sb = new StringBuilder(str);
                sb.append("Module Set ID: ");
                sb.append(bojy.f133370b);
                sb.append(", Module Set Version: ");
                sb.append(bojy.f133373e);
                if ((bojy.f133372d & 128) != 0) {
                    sb.append(" (placebo)");
                }
                printWriter2.println(sb);
                if (bojy.f133374f.size() > 0) {
                    StringBuilder sb2 = new StringBuilder("      ");
                    sb2.append("Enabled features: ");
                    for (int i2 = 0; i2 < bojy.f133374f.size(); i2++) {
                        if (i2 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append((String) bojy.f133374f.get(i2));
                    }
                    printWriter2.println(sb2);
                }
                i++;
            }
            printWriter.println();
            int d = f.mo9179d();
            if (d > 0) {
                printWriter2.println("Blacklisted Modules:");
                for (int i3 = 0; i3 < d; i3++) {
                    String valueOf = String.valueOf(f.mo9178c(i3));
                    printWriter2.println(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
                printWriter.println();
            }
            printWriter2.println("Modules:");
            int c2 = f.mo9177c();
            ArrayList arrayList = new ArrayList(c2);
            int i4 = 0;
            while (i4 < c2) {
                arrayList.add(f.mo9176b(i4));
                i4++;
                dhw = this;
            }
            Collections.sort(arrayList, f13193c);
            String valueOf2 = String.valueOf(new File(dgv.m8427a(dhw.f13194b).f12991b, "m").getAbsolutePath());
            String valueOf3 = String.valueOf(File.separator);
            String str3 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            int b = f.mo9175b();
            djy djy = new djy();
            int i5 = 0;
            int i6 = 0;
            while (i5 < b) {
                f.mo9170a(djy, i5);
                StringBuilder sb3 = new StringBuilder(str);
                sb3.append(djy.mo9155f());
                sb3.append(" [");
                sb3.append(djy.mo9157h());
                sb3.append("] [");
                int i7 = b;
                String g = djy.mo9156g();
                if (!TextUtils.isEmpty(g)) {
                    sb3.append(g);
                    sb3.append("] [");
                }
                int a2 = dik.m8576a(djy.mo9149a());
                int i8 = a2 - 1;
                if (a2 != 0) {
                    int i9 = i6;
                    if (i8 != 1) {
                        str2 = str;
                        if (i8 != 2) {
                            djz = f;
                            if (i8 == 3) {
                                int a3 = dkc.m8723a(djy.mo9158i());
                                int i10 = a3 - 1;
                                if (a3 != 0) {
                                    if (i10 == 1) {
                                        sb3.append("Container");
                                    } else if (i10 == 2) {
                                        sb3.append("Download");
                                    } else if (i10 == 3) {
                                        sb3.append("Installed");
                                    } else if (i10 != 4) {
                                        sb3.append("???");
                                    } else {
                                        sb3.append("System");
                                    }
                                    String b2 = djy.mo9151b();
                                    if (b2.startsWith(str3)) {
                                        b2 = b2.substring(str3.length());
                                    }
                                    sb3.append(":");
                                    sb3.append(b2);
                                } else {
                                    throw null;
                                }
                            } else if (i8 != 4) {
                                sb3.append("???");
                            } else {
                                sb3.append("Split");
                            }
                        } else {
                            djz = f;
                            sb3.append("Installed");
                        }
                    } else {
                        djz = f;
                        str2 = str;
                        sb3.append("Container");
                    }
                    sb3.append("]");
                    int a4 = dik.m8576a(djy.mo9149a());
                    if (a4 == 4 || a4 == 5) {
                        sb3.append(" [");
                        sb3.append(djy.mo9163n());
                        if (djy.mo9164o() != null) {
                            sb3.append(":");
                            sb3.append(djy.mo9164o());
                        }
                        if (djy.mo9165p() != null) {
                            sb3.append(":");
                            sb3.append(djy.mo9165p());
                        }
                        sb3.append("]");
                    }
                    printWriter2.println(sb3);
                    int size2 = arrayList.size();
                    i6 = i9;
                    boolean z = false;
                    while (i6 < size2 && ((dka) arrayList.get(i6)).mo9183R() == i5) {
                        dka dka = (dka) arrayList.get(i6);
                        StringBuilder sb4 = new StringBuilder("      ");
                        sb4.append(dka.mo9184b());
                        sb4.append(" [v");
                        sb4.append(dka.mo9186e());
                        sb4.append("]");
                        printWriter2.println(sb4);
                        i6++;
                        z = true;
                    }
                    if (!z) {
                        printWriter2.println("      No modules accepted");
                    }
                    i5++;
                    b = i7;
                    str = str2;
                    f = djz;
                } else {
                    throw null;
                }
            }
            djz djz2 = f;
            String str4 = str;
            printWriter.println();
            printWriter2.println("Features:");
            int e = djz2.mo9180e();
            brtm brtm = new brtm();
            int i11 = 0;
            while (i11 < e) {
                djz djz3 = djz2;
                djz3.mo9174a(brtm, i11);
                StringBuilder sb5 = new StringBuilder();
                String str5 = str4;
                sb5.append(str5);
                sb5.append(brtm.mo9295P());
                sb5.append(" [v");
                sb5.append(brtm.mo69929s());
                sb5.append("]");
                if (brtm.mo69931t()) {
                    sb5.append(" [optional]");
                }
                printWriter2.println(sb5.toString());
                i11++;
                djz2 = djz3;
                str4 = str5;
            }
            printWriter.println();
        } catch (InvalidConfigException e2) {
            String valueOf4 = String.valueOf(e2);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
            sb6.append("Unable to retrieve config: ");
            sb6.append(valueOf4);
            printWriter2.println(sb6.toString());
        }
    }

    public String getType(Uri uri) {
        if (f13192a.match(uri) != 1) {
            return null;
        }
        return "vnd.android.cursor.item/features";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        bmzs.m108696a(context);
        this.f13194b = context;
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f13192a.match(uri) != 1) {
            int i = Build.VERSION.SDK_INT;
            String callingPackage = getCallingPackage();
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(callingPackage).length() + 23 + String.valueOf(valueOf).length());
            sb.append("Unhandled query from ");
            sb.append(callingPackage);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("ModuleProvider", sb.toString());
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(dhv.f13191a);
        djz a = mo9032a();
        if (a != null) {
            int e = a.mo9180e();
            brtm brtm = new brtm();
            for (int i2 = 0; i2 < e; i2++) {
                a.mo9174a(brtm, i2);
                matrixCursor.addRow(new Object[]{brtm.mo9295P(), Long.valueOf(brtm.mo69929s())});
            }
        }
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
