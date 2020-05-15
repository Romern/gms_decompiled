package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.chimera.LoaderManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: fwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwd extends aont implements Filterable {

    /* renamed from: a */
    public final int f17407a = mo43112i();

    /* renamed from: b */
    public final int f17408b = mo43112i();

    /* renamed from: c */
    public final int f17409c = mo43112i();

    /* renamed from: d */
    public rkb f17410d;

    /* renamed from: e */
    public final Context f17411e;

    /* renamed from: f */
    public final boolean f17412f;

    /* renamed from: g */
    public final boolean f17413g;

    /* renamed from: h */
    public final String f17414h;

    /* renamed from: i */
    public final String[] f17415i;

    /* renamed from: j */
    public final allg f17416j;

    /* renamed from: k */
    public final boolean f17417k;

    /* renamed from: l */
    public final boolean f17418l;

    /* renamed from: m */
    public boolean f17419m;

    /* renamed from: n */
    public final Collection f17420n;

    /* renamed from: o */
    public List f17421o;

    /* renamed from: p */
    public final List f17422p;

    /* renamed from: q */
    public final LoaderManager f17423q;

    /* renamed from: r */
    public fyg f17424r;

    /* renamed from: s */
    public final fwa f17425s;

    /* renamed from: t */
    public String f17426t;

    /* renamed from: u */
    public int f17427u;

    /* renamed from: v */
    public final fvz f17428v = new fvz(this);

    /* renamed from: w */
    public final aono f17429w = new aono();

    /* renamed from: x */
    public final fvy f17430x = new fvy(this);

    /* renamed from: y */
    public fvx f17431y;

    /* renamed from: z */
    private final fwb f17432z;

    public fwd(Context context, boolean z, boolean z2, String str, String[] strArr, LoaderManager loaderManager) {
        super(context);
        this.f17411e = context;
        this.f17412f = z;
        this.f17413g = z2;
        this.f17414h = str;
        this.f17415i = strArr;
        this.f17423q = loaderManager;
        this.f17425s = new fwa(this);
        allf allf = new allf();
        allf.f73618a = 0;
        allf.mo40485b();
        this.f17416j = allf.mo40484a();
        List asList = Arrays.asList(fzm.m12796a(strArr));
        this.f17417k = asList.contains("email");
        this.f17418l = asList.contains("phone");
        this.f17432z = new fwb(this);
        this.f17420n = new LinkedHashSet();
        this.f17421o = new ArrayList();
        this.f17422p = new ArrayList();
        this.f17431y = new fvx(this, this.f17421o);
    }

    /* renamed from: a */
    public static String m12504a(String str) {
        int type;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!(charAt == '(' || charAt == ')' || charAt == '+' || charAt == '.' || (type = Character.getType(charAt)) == 12 || type == 20)) {
                int digit = Character.digit(charAt, 10);
                if (digit != -1) {
                    sb.append(digit);
                } else {
                    sb.append(charAt);
                }
            }
        }
        return sb.toString();
    }

    public final Filter getFilter() {
        return this.f17432z;
    }
}
