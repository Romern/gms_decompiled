package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: sf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1348sf {

    /* renamed from: A */
    int f26987A = -1;

    /* renamed from: B */
    public final int f26988B;

    /* renamed from: C */
    public final int f26989C;

    /* renamed from: D */
    final int f26990D;

    /* renamed from: E */
    final int f26991E;

    /* renamed from: F */
    final int f26992F;

    /* renamed from: G */
    public final boolean f26993G;

    /* renamed from: H */
    final Handler f26994H;

    /* renamed from: I */
    public final View.OnClickListener f26995I = new C1343sa(this);

    /* renamed from: a */
    public final Context f26996a;

    /* renamed from: b */
    final C1374te f26997b;

    /* renamed from: c */
    public final Window f26998c;

    /* renamed from: d */
    public CharSequence f26999d;

    /* renamed from: e */
    public CharSequence f27000e;

    /* renamed from: f */
    ListView f27001f;

    /* renamed from: g */
    public View f27002g;

    /* renamed from: h */
    public int f27003h;

    /* renamed from: i */
    public boolean f27004i = false;

    /* renamed from: j */
    Button f27005j;

    /* renamed from: k */
    public CharSequence f27006k;

    /* renamed from: l */
    Message f27007l;

    /* renamed from: m */
    Button f27008m;

    /* renamed from: n */
    public CharSequence f27009n;

    /* renamed from: o */
    Message f27010o;

    /* renamed from: p */
    Button f27011p;

    /* renamed from: q */
    public CharSequence f27012q;

    /* renamed from: r */
    Message f27013r;

    /* renamed from: s */
    NestedScrollView f27014s;

    /* renamed from: t */
    public int f27015t = 0;

    /* renamed from: u */
    public Drawable f27016u;

    /* renamed from: v */
    public ImageView f27017v;

    /* renamed from: w */
    public TextView f27018w;

    /* renamed from: x */
    public TextView f27019x;

    /* renamed from: y */
    public View f27020y;

    /* renamed from: z */
    ListAdapter f27021z;

    public C1348sf(Context context, C1374te teVar, Window window) {
        this.f26996a = context;
        this.f26997b = teVar;
        this.f26998c = window;
        this.f26994H = new C1346sd(teVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1390tu.f27196e, C0126R.attr.alertDialogStyle, 0);
        this.f26988B = obtainStyledAttributes.getResourceId(0, 0);
        this.f26989C = obtainStyledAttributes.getResourceId(2, 0);
        this.f26990D = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f26991E = obtainStyledAttributes.getResourceId(7, 0);
        this.f26992F = obtainStyledAttributes.getResourceId(3, 0);
        this.f26993G = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        teVar.mo16006c();
    }

    /* renamed from: a */
    public static final ViewGroup m20194a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: b */
    public final void mo15888b(View view) {
        this.f27002g = view;
        this.f27003h = 0;
        this.f27004i = false;
    }

    /* renamed from: b */
    public final void mo15889b(CharSequence charSequence) {
        this.f27000e = charSequence;
        TextView textView = this.f27019x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public static final void m20195a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    static boolean m20196a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m20196a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo15886a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f26994H.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f27012q = charSequence;
            this.f27013r = obtainMessage;
        } else if (i != -2) {
            this.f27006k = charSequence;
            this.f27007l = obtainMessage;
        } else {
            this.f27009n = charSequence;
            this.f27010o = obtainMessage;
        }
    }

    /* renamed from: a */
    public final void mo15887a(CharSequence charSequence) {
        this.f26999d = charSequence;
        TextView textView = this.f27018w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
