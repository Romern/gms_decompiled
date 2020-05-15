package com.google.android.gms.wallet.p088ui.verifypin;

import android.content.Context;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.ui.verifypin.KeyPadView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyPadView extends LinearLayout {

    /* renamed from: a */
    public axcw f110594a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.verifypin.KeyPadView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public KeyPadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_keypad, (ViewGroup) this, true);
        axcu axcu = new axcu(this);
        findViewById(C0126R.C0129id.keypad_button_0).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_1).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_2).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_3).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_4).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_5).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_6).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_7).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_8).setOnClickListener(axcu);
        findViewById(C0126R.C0129id.keypad_button_9).setOnClickListener(axcu);
        ((ImageButton) findViewById(C0126R.C0129id.keypad_button_back)).setOnClickListener(new axcv(this));
        int i = Build.VERSION.SDK_INT;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (!audioManager.isWiredHeadsetOn() && !audioManager.isBluetoothA2dpOn() && Settings.Secure.getInt(getContext().getContentResolver(), "speak_password", 0) == 0) {
            findViewById(C0126R.C0129id.keypad_button_0).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_1).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_2).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_3).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_4).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_5).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_6).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_7).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_8).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
            findViewById(C0126R.C0129id.keypad_button_9).setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_0).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_1).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_2).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_3).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_4).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_5).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_6).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_7).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_8).setEnabled(z);
        findViewById(C0126R.C0129id.keypad_button_9).setEnabled(z);
        ImageButton imageButton = (ImageButton) findViewById(C0126R.C0129id.keypad_button_back);
        imageButton.setEnabled(z);
        if (z) {
            imageButton.clearColorFilter();
        } else {
            imageButton.setColorFilter(-7829368, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
