package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: hhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhj extends adcf {

    /* renamed from: a */
    public static final Logger f19771a = ght.m13172b("SaveAccountLinkingTokenAccountChooserFragment");

    /* renamed from: e */
    private static final int f19772e = C0126R.style.CredentialsDialogTheme;

    /* renamed from: b */
    public hgl f19773b;

    /* renamed from: c */
    public TextView f19774c;

    /* renamed from: d */
    public hdr f19775d;

    /* renamed from: f */
    private aczc f19776f;

    /* renamed from: g */
    private ImageView f19777g;

    /* renamed from: h */
    private RecyclerView f19778h;

    /* renamed from: i */
    private ProgressBar f19779i;

    /* renamed from: j */
    private View f19780j;

    /* renamed from: k */
    private boolean f19781k;

    /* renamed from: l */
    private String f19782l;

    /* renamed from: m */
    private Bitmap f19783m;

    /* renamed from: a */
    public static hhj m14350a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        hhj hhj = new hhj();
        hhj.setArguments(bundle);
        return hhj;
    }

    public final void onActivityCreated(Bundle bundle) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19773b = (hgl) adcj.m50161a(activity).mo3444a(hgl.class);
        this.f19776f = (aczc) adcj.m50161a(activity).mo3444a(aczc.class);
        if (!aczr.m50057a(getContext().getApplicationContext(), this.f19782l).mo66813a()) {
            this.f19773b.mo12457a(new hgk(new Status(10, "Calling package not found."), bmvz.f131120a));
            return;
        }
        Drawable b = C1391tv.m20459b(getContext(), C0126R.C0127drawable.googlelogo_standard_color_74x24);
        if (b != null) {
            if (b instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) b;
                if (bitmapDrawable.getBitmap() != null) {
                    bitmap = bitmapDrawable.getBitmap();
                }
            }
            if (b.getIntrinsicWidth() <= 0 || b.getIntrinsicHeight() <= 0) {
                bitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } else {
                bitmap2 = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(bitmap2);
            b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            b.draw(canvas);
            bitmap = bitmap2;
        } else {
            bitmap = null;
        }
        this.f19783m = bitmap;
        View view = getView();
        this.f19777g = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
        this.f19774c = (TextView) view.findViewById(C0126R.C0129id.title);
        this.f19778h = (RecyclerView) view.findViewById(C0126R.C0129id.list);
        hdr hdr = new hdr(C0126R.C0128layout.f7381x977b130c, this.f19776f, this.f19783m);
        this.f19775d = hdr;
        this.f19778h.setAdapter(hdr);
        this.f19778h.setHasFixedSize(true);
        RecyclerView recyclerView = this.f19778h;
        getContext();
        recyclerView.setLayoutManager(new aah());
        if (this.f19774c != null) {
            float dimension = getResources().getDimension(C0126R.dimen.f7433xde868016);
            float dimension2 = getResources().getDimension(C0126R.dimen.f7432xd87a88d7);
            this.f19777g.getLayoutParams().width = (int) dimension;
            this.f19777g.getLayoutParams().height = (int) dimension2;
            view.findViewById(C0126R.C0129id.subtitle).setVisibility(8);
            this.f19777g.setImageBitmap(this.f19783m);
            this.f19774c.setText((int) C0126R.string.credentials_saving_account_linking_token_account_header_title);
        }
        this.f19779i = (ProgressBar) view.findViewById(C0126R.C0129id.loading_progress);
        View findViewById = view.findViewById(C0126R.C0129id.container_overlay);
        this.f19780j = findViewById;
        findViewById.setOnTouchListener(hhi.f19770a);
        mo12469a(this.f19781k);
        this.f19776f.f61123d.mo2445a(this, new hhf(this));
        this.f19776f.f61122a.mo2445a(this, new hhg(this));
        this.f19776f.f61125f.mo2445a(this, new hhh(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getActivity(), f19772e)).inflate((int) C0126R.C0128layout.credentials_account_chooser_fragment, viewGroup, false);
        if (bundle != null) {
            this.f19781k = bundle.getBoolean("block_user_interaction", false);
        }
        this.f19782l = getArguments().getString("calling_package");
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("block_user_interaction", this.f19781k);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo12469a(boolean z) {
        this.f19781k = z;
        View view = this.f19780j;
        int i = !z ? 8 : 0;
        view.setVisibility(i);
        this.f19779i.setVisibility(i);
    }
}
