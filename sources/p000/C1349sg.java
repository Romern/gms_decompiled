package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.p002v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

/* renamed from: sg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1349sg {

    /* renamed from: a */
    private final C1345sc f27022a;

    /* renamed from: b */
    private final int f27023b;

    public C1349sg(Context context) {
        this(context, C1350sh.m20224a(context, 0));
    }

    /* renamed from: a */
    public final Context mo15890a() {
        return this.f27022a.f26963a;
    }

    /* renamed from: a */
    public final void mo15891a(int i) {
        this.f27022a.f26965c = i;
    }

    /* renamed from: a */
    public final void mo15893a(DialogInterface.OnCancelListener onCancelListener) {
        this.f27022a.f26975m = onCancelListener;
    }

    /* renamed from: a */
    public final void mo15894a(DialogInterface.OnDismissListener onDismissListener) {
        this.f27022a.f26976n = onDismissListener;
    }

    /* renamed from: a */
    public final void mo15895a(DialogInterface.OnKeyListener onKeyListener) {
        this.f27022a.f26977o = onKeyListener;
    }

    /* renamed from: a */
    public final void mo15896a(Drawable drawable) {
        this.f27022a.f26966d = drawable;
    }

    /* renamed from: a */
    public final void mo15897a(View view) {
        this.f27022a.f26968f = view;
    }

    /* renamed from: a */
    public final void mo15898a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26979q = listAdapter;
        scVar.f26980r = onClickListener;
        scVar.f26985w = i;
        scVar.f26984v = true;
    }

    /* renamed from: a */
    public final void mo15899a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26979q = listAdapter;
        scVar.f26980r = onClickListener;
    }

    /* renamed from: a */
    public void mo15900a(CharSequence charSequence) {
        this.f27022a.f26969g = charSequence;
    }

    /* renamed from: a */
    public final void mo15901a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26972j = charSequence;
        scVar.f26973k = onClickListener;
    }

    /* renamed from: a */
    public final void mo15902a(boolean z) {
        this.f27022a.f26974l = z;
    }

    /* renamed from: a */
    public final void mo15903a(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26978p = charSequenceArr;
        scVar.f26980r = onClickListener;
        scVar.f26985w = i;
        scVar.f26984v = true;
    }

    /* renamed from: b */
    public C1350sh mo15904b() {
        int i;
        C1350sh shVar = new C1350sh(this.f27022a.f26963a, this.f27023b);
        C1345sc scVar = this.f27022a;
        C1348sf sfVar = shVar.f27024a;
        View view = scVar.f26968f;
        if (view == null) {
            CharSequence charSequence = scVar.f26967e;
            if (charSequence != null) {
                sfVar.mo15887a(charSequence);
            }
            Drawable drawable = scVar.f26966d;
            if (drawable != null) {
                sfVar.f27016u = drawable;
                sfVar.f27015t = 0;
                ImageView imageView = sfVar.f27017v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    sfVar.f27017v.setImageDrawable(drawable);
                }
            }
            int i2 = scVar.f26965c;
            if (i2 != 0) {
                sfVar.f27016u = null;
                sfVar.f27015t = i2;
                ImageView imageView2 = sfVar.f27017v;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    sfVar.f27017v.setImageResource(sfVar.f27015t);
                }
            }
        } else {
            sfVar.f27020y = view;
        }
        CharSequence charSequence2 = scVar.f26969g;
        if (charSequence2 != null) {
            sfVar.mo15889b(charSequence2);
        }
        CharSequence charSequence3 = scVar.f26970h;
        if (charSequence3 != null) {
            sfVar.mo15886a(-1, charSequence3, scVar.f26971i);
        }
        CharSequence charSequence4 = scVar.f26972j;
        if (charSequence4 != null) {
            sfVar.mo15886a(-2, charSequence4, scVar.f26973k);
        }
        if (!(scVar.f26978p == null && scVar.f26979q == null)) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) scVar.f26964b.inflate(sfVar.f26990D, (ViewGroup) null);
            if (scVar.f26984v) {
                i = sfVar.f26991E;
            } else {
                i = sfVar.f26992F;
            }
            ListAdapter listAdapter = scVar.f26979q;
            if (listAdapter == null) {
                listAdapter = new C1347se(scVar.f26963a, i, scVar.f26978p);
            }
            sfVar.f27021z = listAdapter;
            sfVar.f26987A = scVar.f26985w;
            if (scVar.f26980r != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1344sb(scVar, sfVar));
            }
            if (scVar.f26984v) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            sfVar.f27001f = alertController$RecycleListView;
        }
        View view2 = scVar.f26982t;
        if (view2 == null) {
            int i3 = scVar.f26981s;
            if (i3 != 0) {
                sfVar.f27002g = null;
                sfVar.f27003h = i3;
                sfVar.f27004i = false;
            }
        } else {
            sfVar.mo15888b(view2);
        }
        shVar.setCancelable(this.f27022a.f26974l);
        if (this.f27022a.f26974l) {
            shVar.setCanceledOnTouchOutside(true);
        }
        shVar.setOnCancelListener(this.f27022a.f26975m);
        shVar.setOnDismissListener(this.f27022a.f26976n);
        DialogInterface.OnKeyListener onKeyListener = this.f27022a.f26977o;
        if (onKeyListener != null) {
            shVar.setOnKeyListener(onKeyListener);
        }
        return shVar;
    }

    /* renamed from: b */
    public final void mo15907b(View view) {
        C1345sc scVar = this.f27022a;
        scVar.f26982t = view;
        scVar.f26981s = 0;
        scVar.f26983u = false;
    }

    /* renamed from: b */
    public final void mo15908b(CharSequence charSequence) {
        this.f27022a.f26967e = charSequence;
    }

    /* renamed from: b */
    public final void mo15909b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26970h = charSequence;
        scVar.f26971i = onClickListener;
    }

    /* renamed from: c */
    public final C1350sh mo15910c() {
        C1350sh b = mo15904b();
        b.show();
        return b;
    }

    /* renamed from: c */
    public final void mo15911c(int i) {
        C1345sc scVar = this.f27022a;
        scVar.f26982t = null;
        scVar.f26981s = i;
        scVar.f26983u = false;
    }

    /* renamed from: d */
    public void mo15912d(int i) {
        C1345sc scVar = this.f27022a;
        scVar.f26969g = scVar.f26963a.getText(i);
    }

    public C1349sg(Context context, int i) {
        this.f27022a = new C1345sc(new ContextThemeWrapper(context, C1350sh.m20224a(context, i)));
        this.f27023b = i;
    }

    /* renamed from: a */
    public final void mo15892a(int i, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26972j = scVar.f26963a.getText(i);
        this.f27022a.f26973k = onClickListener;
    }

    /* renamed from: b */
    public final void mo15905b(int i) {
        C1345sc scVar = this.f27022a;
        scVar.f26967e = scVar.f26963a.getText(i);
    }

    /* renamed from: b */
    public final void mo15906b(int i, DialogInterface.OnClickListener onClickListener) {
        C1345sc scVar = this.f27022a;
        scVar.f26970h = scVar.f26963a.getText(i);
        this.f27022a.f26971i = onClickListener;
    }
}
