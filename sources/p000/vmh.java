package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vmh extends acm {

    /* renamed from: s */
    protected final TextView f49515s;

    /* renamed from: t */
    protected final TextView f49516t;

    /* renamed from: u */
    protected final ImageView f49517u;

    /* renamed from: v */
    final ImageView f49518v;

    /* renamed from: w */
    final ImageView f49519w;

    /* renamed from: x */
    final ImageView f49520x;

    public vmh(View view) {
        super(view);
        this.f49515s = (TextView) view.findViewById(C0126R.C0129id.drive_file_list_item_title);
        this.f49516t = (TextView) view.findViewById(C0126R.C0129id.drive_file_list_item_subtitle);
        this.f49517u = (ImageView) view.findViewById(C0126R.C0129id.drive_file_list_item_icon);
        this.f49518v = (ImageView) view.findViewById(C0126R.C0129id.drive_file_list_item_state_on_device);
        this.f49519w = (ImageView) view.findViewById(C0126R.C0129id.drive_file_list_item_state_shared);
        this.f49520x = (ImageView) view.findViewById(C0126R.C0129id.drive_file_list_item_state_starred);
    }
}
