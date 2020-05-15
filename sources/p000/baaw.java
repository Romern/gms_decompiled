package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: baaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baaw {

    /* renamed from: f */
    public static final baqt f100396f = new baqt(bygw.f166398b);

    /* renamed from: a */
    public final cayo f100397a;

    /* renamed from: b */
    public final File f100398b;

    /* renamed from: c */
    public final String f100399c;

    /* renamed from: d */
    public final Pattern f100400d;

    /* renamed from: e */
    public final Object f100401e = new Object();

    /* renamed from: g */
    private final FilenameFilter f100402g;

    public baaw(cayo cayo, File file, String str) {
        this.f100397a = cayo;
        this.f100398b = file;
        this.f100399c = str;
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append(str);
        sb.append("_([0-9A-F]{16})");
        this.f100400d = Pattern.compile(sb.toString());
        this.f100402g = new baav(this.f100400d);
    }

    /* renamed from: a */
    public final void mo55551a(int i) {
        String[] a = mo55552a();
        if (a != null) {
            for (int i2 = 0; i2 < a.length - i; i2++) {
                File file = new File(this.f100398b, a[i2]);
                if (!file.delete()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    sb.append("Couldn't delete ");
                    sb.append(valueOf);
                    ((achw) this.f100397a.mo16713a()).mo25416d(sb.toString(), new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public final String[] mo55552a() {
        String[] list = this.f100398b.list(this.f100402g);
        if (list == null) {
            return null;
        }
        Arrays.sort(list);
        return list;
    }
}
