package com.google.android.gms.walletp2p.feature.widgets.transactiondetailslayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview.FifeNetworkImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransactionDetailsLayout extends LinearLayout {

    /* renamed from: a */
    public FifeNetworkImageView f110766a = ((FifeNetworkImageView) findViewById(C0126R.C0129id.avatar_view));

    /* renamed from: b */
    public final AccountParticleDisc f110767b = ((AccountParticleDisc) findViewById(C0126R.C0129id.account_particle_disc));

    /* renamed from: c */
    public TextView f110768c = ((TextView) findViewById(C0126R.C0129id.directional_counter_party_label));

    /* renamed from: d */
    public final TextView f110769d = ((TextView) findViewById(C0126R.C0129id.directional_counter_party_account));

    /* renamed from: e */
    public final TextView f110770e = ((TextView) findViewById(C0126R.C0129id.date_title));

    /* renamed from: f */
    public TextView f110771f = ((TextView) findViewById(C0126R.C0129id.date_label));

    /* renamed from: g */
    public final TextView f110772g = ((TextView) findViewById(C0126R.C0129id.date_text));

    /* renamed from: h */
    public final TextView f110773h = ((TextView) findViewById(C0126R.C0129id.memo_title));

    /* renamed from: i */
    public TextView f110774i = ((TextView) findViewById(C0126R.C0129id.memo_label));

    /* renamed from: j */
    public final TextView f110775j = ((TextView) findViewById(C0126R.C0129id.memo_text));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.walletp2p.feature.widgets.transactiondetailslayout.TransactionDetailsLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public TransactionDetailsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_transaction_details_layout, (ViewGroup) this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
    }
}
