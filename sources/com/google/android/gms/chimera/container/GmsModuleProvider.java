package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsModuleProvider extends dhw {

    /* renamed from: d */
    public static final UriMatcher f29977d;

    /* renamed from: e */
    public Context f29978e;

    /* renamed from: f */
    private sts f29979f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f29977d = uriMatcher;
        uriMatcher.addURI("*", "api/*", 1);
        f29977d.addURI("*", "api_force_staging/*", 2);
    }

    /* renamed from: b */
    public final void mo9033b() {
        qmj.m32440a().mo24109b();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        String str2;
        djz djz;
        String str3;
        GmsModuleProvider gmsModuleProvider = this;
        PrintWriter printWriter2 = printWriter;
        dfy a = dfy.m8329a(gmsModuleProvider.f13194b);
        try {
            djz f = a.mo8898f();
            dky c = a.mo8895c(f);
            printWriter2.println("Module Sets:");
            int size = c.size();
            int i = 0;
            while (true) {
                str2 = "  ";
                if (i >= size) {
                    break;
                }
                bojy bojy = (bojy) c.get(i);
                StringBuilder sb = new StringBuilder(str2);
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
                    printWriter2.println(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
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
                gmsModuleProvider = this;
            }
            Collections.sort(arrayList, dhw.f13193c);
            String valueOf2 = String.valueOf(new File(dgv.m8427a(gmsModuleProvider.f13194b).f12991b, "m").getAbsolutePath());
            String valueOf3 = String.valueOf(File.separator);
            String str4 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            int b = f.mo9175b();
            djy djy = new djy();
            int i5 = 0;
            int i6 = 0;
            while (i5 < b) {
                f.mo9170a(djy, i5);
                StringBuilder sb3 = new StringBuilder(str2);
                sb3.append(djy.mo9155f());
                sb3.append(" [");
                int i7 = b;
                sb3.append(djy.mo9157h());
                sb3.append("] [");
                int i8 = i6;
                String g = djy.mo9156g();
                if (!TextUtils.isEmpty(g)) {
                    sb3.append(g);
                    sb3.append("] [");
                }
                int a2 = dik.m8576a(djy.mo9149a());
                int i9 = a2 - 1;
                if (a2 != 0) {
                    if (i9 != 1) {
                        str3 = str2;
                        if (i9 != 2) {
                            djz = f;
                            if (i9 == 3) {
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
                                    if (b2.startsWith(str4)) {
                                        b2 = b2.substring(str4.length());
                                    }
                                    sb3.append(":");
                                    sb3.append(b2);
                                } else {
                                    throw null;
                                }
                            } else if (i9 != 4) {
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
                        str3 = str2;
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
                    i6 = i8;
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
                    str2 = str3;
                    f = djz;
                } else {
                    throw null;
                }
            }
            djz djz2 = f;
            String str5 = str2;
            printWriter.println();
            printWriter2.println("Features:");
            int e = djz2.mo9180e();
            brtm brtm = new brtm();
            int i11 = 0;
            while (i11 < e) {
                djz djz3 = djz2;
                djz3.mo9174a(brtm, i11);
                StringBuilder sb5 = new StringBuilder();
                String str6 = str5;
                sb5.append(str6);
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
                str5 = str6;
            }
            printWriter.println();
        } catch (InvalidConfigException e2) {
            String valueOf4 = String.valueOf(e2);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
            sb6.append("Unable to retrieve config: ");
            sb6.append(valueOf4);
            printWriter2.println(sb6.toString());
        }
        printWriter2.println("\nModule Set Journal Entries:\n");
        qli qli = new qli(aytw.m84817d(this.f29978e.getApplicationContext()).getSharedPreferences("ChimeraConfigService", 4), true);
        qor c3 = qli.mo24079c();
        Set b3 = qli.mo24077b();
        bxwc bxwc = c3.f41891a;
        int size3 = bxwc.size();
        for (int i12 = 0; i12 < size3; i12++) {
            qov qov = (qov) bxwc.get(i12);
            String str7 = qov.f41900b;
            long j = qov.f41901c;
            if (!b3.contains(str7)) {
                str = "";
            } else {
                str = ":BLACKLISTED";
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(str7).length() + 21 + str.length());
            sb7.append(str7);
            sb7.append(":");
            sb7.append(j);
            sb7.append(str);
            printWriter2.println(sb7.toString());
            printWriter2.println("-----");
            printWriter2.println(qoy.m32605a(qov));
            printWriter.println();
        }
        String valueOf5 = String.valueOf(Base64.encodeToString((byte[]) qlk.f41648d.mo58455c(), 2));
        printWriter2.println(valueOf5.length() == 0 ? new String("\nmodule_set_list: ") : "\nmodule_set_list: ".concat(valueOf5));
        String valueOf6 = String.valueOf(Base64.encodeToString((byte[]) qlk.f41646b.mo58455c(), 2));
        printWriter2.println(valueOf6.length() == 0 ? new String("required_features: ") : "required_features: ".concat(valueOf6));
        bxvd da = dje.f13319b.mo74144da();
        da.mo74060h(dgh.m8389a(this.f29978e).mo8953d());
        String valueOf7 = String.valueOf(Base64.encodeToString(((dje) da.mo74062i()).mo73642k(), 2));
        printWriter2.println(valueOf7.length() == 0 ? new String("requested_features: ") : "requested_features: ".concat(valueOf7));
    }

    public final String getType(Uri uri) {
        String str;
        if (dhw.f13192a.match(uri) != 1) {
            str = null;
        } else {
            str = "vnd.android.cursor.item/features";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int match = f29977d.match(uri);
        if (match == 1 || match == 2) {
            return "vnd.android.cursor.item/api";
        }
        return null;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        ParcelFileDescriptor dup;
        int match = f29977d.match(uri);
        if (match != 1 && match != 2) {
            return super.openFile(uri, str);
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2 || pathSegments.get(1).isEmpty()) {
            Log.e("GmsModuleProvider", "No configLastModTime in openFile");
            return null;
        }
        try {
            long parseLong = Long.parseLong(pathSegments.get(1));
            dfy a = dfy.m8329a(this.f29978e);
            try {
                synchronized (a.f13033e) {
                    a.mo8898f();
                    FileInputStream fileInputStream = a.f13034f;
                    if ((parseLong == -1 || parseLong == a.f13035g) && fileInputStream != null) {
                        dup = ParcelFileDescriptor.dup(fileInputStream.getFD());
                    } else {
                        throw new InvalidConfigException("module configuration is not current");
                    }
                }
                return dup;
            } catch (InvalidConfigException | IOException e) {
                String valueOf = String.valueOf(e.toString());
                Log.e("GmsModuleProvider", valueOf.length() == 0 ? new String("Failed to get config file descriptor: ") : "Failed to get config file descriptor: ".concat(valueOf));
                return null;
            }
        } catch (NumberFormatException e2) {
            String valueOf2 = String.valueOf(e2.toString());
            Log.e("GmsModuleProvider", valueOf2.length() == 0 ? new String("Invalid configLastModTime in openFile: ") : "Invalid configLastModTime in openFile: ".concat(valueOf2));
            return null;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        int match = f29977d.match(uri);
        MatrixCursor matrixCursor = null;
        if (match == 1) {
            z = false;
        } else if (match != 2) {
            if (dhw.f13192a.match(uri) != 1) {
                int i = Build.VERSION.SDK_INT;
                String callingPackage = getCallingPackage();
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(callingPackage).length() + 23 + String.valueOf(valueOf).length());
                sb.append("Unhandled query from ");
                sb.append(callingPackage);
                sb.append(": ");
                sb.append(valueOf);
                Log.e("ModuleProvider", sb.toString());
            } else {
                matrixCursor = new MatrixCursor(dhv.f13191a);
                djz a = mo9032a();
                if (a != null) {
                    int e = a.mo9180e();
                    brtm brtm = new brtm();
                    for (int i2 = 0; i2 < e; i2++) {
                        a.mo9174a(brtm, i2);
                        matrixCursor.addRow(new Object[]{brtm.mo9295P(), Long.valueOf(brtm.mo69929s())});
                    }
                }
            }
            return matrixCursor;
        } else {
            z = true;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2 || pathSegments.get(1).isEmpty()) {
            Log.e("GmsModuleProvider", "No featureName in query.");
            return null;
        }
        StrictMode.ThreadPolicy a2 = stl.m36298a();
        try {
            return qmj.m32440a().mo24108a(this.f29978e, this.f29979f, uri, z, cdjl.f180997a.mo6606a().mo77712r());
        } finally {
            StrictMode.setThreadPolicy(a2);
        }
    }

    public final boolean onCreate() {
        Context context = getContext();
        bmzs.m108696a(context);
        this.f13194b = context;
        Context context2 = getContext();
        bmzs.m108696a(context2);
        this.f29978e = context2;
        this.f29979f = new sts(context2);
        qlp.m32393a();
        return true;
    }
}
