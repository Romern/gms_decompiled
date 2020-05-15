package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.internal.ContentRating;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: adik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adik {

    /* renamed from: a */
    public static final adfs f61806a = new adfs("MetadataDatastore");

    /* renamed from: b */
    public final adfd f61807b;

    /* renamed from: c */
    public final adha f61808c;

    /* renamed from: d */
    public final String f61809d;

    /* renamed from: e */
    public final Map f61810e = new C1223np(1);

    /* renamed from: f */
    private final Context f61811f;

    /* renamed from: g */
    private final bqgj f61812g;

    public adik(Context context, adfd adfd, adha adha, String str, bqgj bqgj) {
        this.f61811f = context;
        this.f61807b = adfd;
        this.f61809d = String.valueOf(str).concat("/appIcons");
        this.f61808c = adha;
        this.f61812g = bqgj;
    }

    /* renamed from: a */
    private static List m50513a(List list, String str) {
        if (list.isEmpty() || (list.size() == 1 && ((String) list.get(0)).equals(str))) {
            return Collections.emptyList();
        }
        int indexOf = list.indexOf(str);
        if (indexOf == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(indexOf);
        return arrayList;
    }

    /* renamed from: n */
    private final bqgg m50515n(String str) {
        synchronized (this.f61810e) {
            bqgg bqgg = (bqgg) this.f61810e.get(str);
            if (bqgg != null) {
                return bqgg;
            }
            bqgg b = this.f61812g.mo25819b(new adij(this, str));
            this.f61810e.put(str, b);
            return b;
        }
    }

    /* renamed from: b */
    public final adhd mo33533b(String str) {
        mo33534b();
        byte[] a = this.f61808c.mo33514a(mo33542j(str));
        if (a == null) {
            return null;
        }
        return (adhd) GeneratedMessageLite.m124016a(adhd.f61664j, a, bxus.m123743b());
    }

    /* renamed from: c */
    public final adhz mo33535c(String str) {
        mo33534b();
        byte[] a = this.f61808c.mo33514a(mo33536d(str));
        if (a == null) {
            return null;
        }
        return (adhz) GeneratedMessageLite.m124016a(adhz.f61753e, a, bxus.m123743b());
    }

    /* renamed from: d */
    public final byte[] mo33536d(String str) {
        return String.valueOf(str).concat("-as").getBytes(adfh.f61554b);
    }

    /* renamed from: e */
    public final Bitmap mo33537e(String str) {
        File file;
        synchronized (this.f61810e) {
            file = new File(this.f61809d, str);
            if (!file.isFile()) {
                bqgg n = m50515n(str);
                try {
                    file = (File) n.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    file = null;
                } catch (ExecutionException e2) {
                    f61806a.mo33424a(e2);
                    file = null;
                }
            } else if (file.lastModified() + TimeUnit.SECONDS.toMillis(cepl.f183185a.mo6606a().mo79532c()) < System.currentTimeMillis()) {
                m50515n(str);
            }
        }
        if (file != null) {
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        return null;
    }

    /* renamed from: f */
    public final adhv mo33538f(String str) {
        mo33534b();
        byte[] a = this.f61808c.mo33514a(mo33543k(str));
        if (a == null) {
            return null;
        }
        return (adhv) GeneratedMessageLite.m124016a(adhv.f61728m, a, bxus.m123743b());
    }

    /* renamed from: g */
    public final boolean mo33539g(String str) {
        mo33534b();
        byte[] a = this.f61808c.mo33514a(mo33544l(str));
        if (!(a == null || a.length == 0)) {
            adhw adhw = (adhw) GeneratedMessageLite.m124016a(adhw.f61742b, a, bxus.m123743b());
            if (adhw.f61744a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                adia adia = adhw.f61744a;
                if (adia == null) {
                    adia = adia.f61759b;
                }
                if (currentTimeMillis < adia.f61761a) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final byte[] mo33540h(String str) {
        return String.valueOf(str).concat("-perm").getBytes(adfh.f61554b);
    }

    /* renamed from: i */
    public final byte[] mo33541i(String str) {
        return String.valueOf(str).concat("-sigs").getBytes(adfh.f61554b);
    }

    /* renamed from: j */
    public final byte[] mo33542j(String str) {
        return String.valueOf(str).concat("-m").getBytes(adfh.f61554b);
    }

    /* renamed from: k */
    public final byte[] mo33543k(String str) {
        return String.valueOf(str).concat("-info").getBytes(adfh.f61554b);
    }

    /* renamed from: l */
    public final byte[] mo33544l(String str) {
        return String.valueOf(str).concat("-ao").getBytes(adfh.f61554b);
    }

    /* renamed from: m */
    public final void mo33545m(String str) {
        InputStream inputStream;
        try {
            adhv f = mo33538f(str);
            if (f != null) {
                String str2 = f.f61735f;
                if (!TextUtils.isEmpty(str2)) {
                    File file = new File(this.f61809d);
                    if (file.exists() || file.mkdir()) {
                        Uri parse = Uri.parse(str2);
                        if (!"content".equals(parse.getScheme())) {
                            try {
                                Context context = this.f61811f;
                                sdo.m34974b(!TextUtils.isEmpty(str2));
                                Resources resources = context.getResources();
                                int max = Math.max(resources.getDimensionPixelSize(17104902), resources.getDimensionPixelSize(17104901));
                                URL url = new URL(ryx.m34684a("s" + max + "-v1-rw", str2).toString());
                                HttpURLConnection httpURLConnection = null;
                                try {
                                    shr.m35316b(13824);
                                    adfb a = this.f61807b.mo33411a();
                                    httpURLConnection = new aboy(this.f61811f).mo32271a(url);
                                    try {
                                        if (httpURLConnection.getResponseCode() != 200) {
                                            a.mo33409a("MetadataDatastore.appIconFetchFailed");
                                            f61806a.mo33429c("Failed to fetch app icon (HTTP %d): %s", Integer.valueOf(httpURLConnection.getResponseCode()), url);
                                        } else {
                                            inputStream = httpURLConnection.getInputStream();
                                            m50514a(inputStream, str, url);
                                            srz.m36171a((Closeable) inputStream);
                                            a.mo33409a("MetadataDatastore.appIconFetchSuccess");
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        try {
                                            f61806a.mo33425a(e, "Error fetching app icon %s", url);
                                            stp.m36307a(httpURLConnection);
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        stp.m36307a(httpURLConnection);
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    f61806a.mo33425a(e, "Error fetching app icon %s", url);
                                    stp.m36307a(httpURLConnection);
                                } catch (Throwable th3) {
                                    th = th3;
                                    stp.m36307a(httpURLConnection);
                                    throw th;
                                }
                                stp.m36307a(httpURLConnection);
                            } catch (MalformedURLException e3) {
                                f61806a.mo33426b("Bad app icon URL: %s", str2);
                            }
                        } else {
                            try {
                                InputStream openInputStream = this.f61811f.getContentResolver().openInputStream(parse);
                                try {
                                    m50514a(openInputStream, str, str2);
                                } finally {
                                    srz.m36171a((Closeable) openInputStream);
                                }
                            } catch (FileNotFoundException e4) {
                                f61806a.mo33426b("Error opening content URI %s", parse);
                            }
                        }
                    } else {
                        f61806a.mo33426b("Unable to create icon dir: %s", this.f61809d);
                    }
                }
            }
        } catch (IOException e5) {
            f61806a.mo33425a(e5, "getAppLaunchInfo failed", new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m50514a(InputStream inputStream, String str, Object obj) {
        File file = new File(this.f61809d, String.valueOf(str).concat(".download"));
        try {
            try {
                Object[] objArr = {Long.valueOf(srz.m36168a(inputStream, new FileOutputStream(file), true)), obj};
                File file2 = new File(this.f61809d, str);
                if ((!file2.exists() || file2.delete()) && !file.renameTo(file2)) {
                    f61806a.mo33426b("Failed to rename %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
                }
            } catch (IOException e) {
                f61806a.mo33425a(e, "Error fetching app icon %s", obj);
                file.delete();
            }
        } catch (FileNotFoundException e2) {
            f61806a.mo33425a(e2, "Error writing app icon to %s", file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public final void mo33534b() {
        if (!this.f61808c.mo33513a()) {
            throw new IOException("Metadata DB not loaded.");
        }
    }

    /* renamed from: a */
    public final adie mo33527a(String str) {
        mo33534b();
        byte[] a = this.f61808c.mo33514a(mo33540h(str));
        if (a == null) {
            return null;
        }
        return (adie) GeneratedMessageLite.m124016a(adie.f61780d, a, bxus.m123743b());
    }

    /* renamed from: a */
    public final VisitedApplication mo33528a(String str, adhz adhz, adhv adhv) {
        BitmapTeleporter bitmapTeleporter;
        ContentRating contentRating;
        Bitmap e = mo33537e(str);
        if (e != null) {
            BitmapTeleporter bitmapTeleporter2 = new BitmapTeleporter(e);
            bitmapTeleporter2.mo17760a(this.f61811f.getCacheDir());
            bitmapTeleporter = bitmapTeleporter2;
        } else {
            bitmapTeleporter = null;
        }
        HashSet hashSet = new HashSet();
        if (adhv != null) {
            bxwc bxwc = adhv.f61730a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                adig adig = (adig) bxwc.get(i);
                if (!adig.f61789c.isEmpty()) {
                    hashSet.add(adig.f61789c);
                }
            }
        }
        adic adic = adhz.f61758d;
        if (adic != null) {
            contentRating = new ContentRating(adic.f61773a, adic.f61774b);
        } else {
            contentRating = null;
        }
        return new VisitedApplication(bitmapTeleporter, adhz.f61755a, adhz.f61756b, adhz.f61757c, str, hashSet, contentRating);
    }

    /* renamed from: a */
    public final String mo33529a(byte[] bArr) {
        String str = new String(bArr, adfh.f61554b);
        if (str.endsWith("-ao")) {
            return str.substring(0, str.length() - 3);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo33530a() {
        mo33534b();
        this.f61808c.mo33519d();
    }

    /* renamed from: a */
    public final void mo33531a(String str, adhx adhx) {
        mo33534b();
        byte[] bytes = String.valueOf(str).concat("-open-browser").getBytes(adfh.f61554b);
        if (this.f61808c.mo33514a(bytes) != null) {
            this.f61808c.mo33516b(bytes);
        }
        byte[] l = mo33544l(str);
        sdo.m34959a(adhx);
        if (adhx.f61747a != null && adhx.f61748b != null) {
            if (!adhx.f61749c) {
                byte[] a = this.f61808c.mo33514a(l);
                bxvd da = adhw.f61742b.mo74144da();
                if (a != null && a.length > 0) {
                    da.mo73635b(a, bxus.m123743b());
                }
                adhy adhy = adhx.f61747a;
                if (adhy == null) {
                    adhy = adhy.f61750b;
                }
                adhw adhw = adhx.f61748b;
                if (adhw == null) {
                    adhw = adhw.f61742b;
                }
                if (adhy.f61752a) {
                    adia adia = adhw.f61744a;
                    if (adia == null) {
                        adia = adia.f61759b;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    adia.getClass();
                    ((adhw) da.f164949b).f61744a = adia;
                }
                this.f61808c.mo33512a(l, ((adhw) da.mo74062i()).serializeToBytes());
                return;
            }
            this.f61808c.mo33516b(l);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33532a(String str, String str2, int i) {
        bxvd bxvd;
        mo33534b();
        adie a = mo33527a(str);
        if (a == null) {
            bxvd = adie.f61780d.mo74144da();
        } else {
            bxvd bxvd2 = (bxvd) a.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) a);
            bxvd = bxvd2;
        }
        if (i == 0) {
            if (!Collections.unmodifiableList(((adie) bxvd.f164949b).f61782a).contains(str2)) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                adie adie = (adie) bxvd.f164949b;
                str2.getClass();
                adie.mo33523a();
                adie.f61782a.add(str2);
            }
            List a2 = m50513a(Collections.unmodifiableList(((adie) bxvd.f164949b).f61783b), str2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((adie) bxvd.f164949b).f61783b = GeneratedMessageLite.m124030de();
            bxvd.mo73957T(a2);
            List a3 = m50513a(Collections.unmodifiableList(((adie) bxvd.f164949b).f61784c), str2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((adie) bxvd.f164949b).f61784c = GeneratedMessageLite.m124030de();
            bxvd.mo73958U(a3);
        } else if (i != 1) {
            List a4 = m50513a(Collections.unmodifiableList(((adie) bxvd.f164949b).f61782a), str2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((adie) bxvd.f164949b).f61782a = GeneratedMessageLite.m124030de();
            bxvd.mo73959V(a4);
            if (!Collections.unmodifiableList(((adie) bxvd.f164949b).f61783b).contains(str2)) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                adie adie2 = (adie) bxvd.f164949b;
                str2.getClass();
                adie2.mo33524b();
                adie2.f61783b.add(str2);
            }
            List a5 = m50513a(Collections.unmodifiableList(((adie) bxvd.f164949b).f61784c), str2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((adie) bxvd.f164949b).f61784c = GeneratedMessageLite.m124030de();
            bxvd.mo73958U(a5);
        } else {
            List a6 = m50513a(Collections.unmodifiableList(((adie) bxvd.f164949b).f61782a), str2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((adie) bxvd.f164949b).f61782a = GeneratedMessageLite.m124030de();
            bxvd.mo73959V(a6);
            List a7 = m50513a(Collections.unmodifiableList(((adie) bxvd.f164949b).f61783b), str2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((adie) bxvd.f164949b).f61783b = GeneratedMessageLite.m124030de();
            bxvd.mo73957T(a7);
            if (!Collections.unmodifiableList(((adie) bxvd.f164949b).f61784c).contains(str2)) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                adie adie3 = (adie) bxvd.f164949b;
                str2.getClass();
                adie3.mo33525c();
                adie3.f61784c.add(str2);
            }
        }
        this.f61808c.mo33512a(mo33540h(str), ((adie) bxvd.mo74062i()).serializeToBytes());
    }
}
