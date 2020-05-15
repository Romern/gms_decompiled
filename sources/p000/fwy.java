package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: fwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwy extends DialogFragment {

    /* renamed from: a */
    public View.OnClickListener f17490a;

    /* renamed from: b */
    private ImageView f17491b;

    /* renamed from: c */
    private Bitmap f17492c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2132018563);
        if (getArguments() != null) {
            this.f17492c = (Bitmap) getArguments().getParcelable("image");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.appinvite_image_preview, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.image_full_view);
        this.f17491b = imageView;
        imageView.setImageBitmap(this.f17492c);
        this.f17491b.setContentDescription(getString(C0126R.string.appinvite_image_preview));
        View.OnClickListener onClickListener = this.f17490a;
        if (onClickListener != null) {
            this.f17491b.setOnClickListener(onClickListener);
        }
        return inflate;
    }
}
