package com.google.android.gms.walletp2p.feature.widgets.keypadview;

import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyPadView extends LinearLayout {

    /* renamed from: a */
    public axli f110752a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.walletp2p.feature.widgets.keypadview.KeyPadView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public KeyPadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_keypad_view, (ViewGroup) this, true);
        axlf axlf = new axlf(this);
        findViewById(C0126R.C0129id.keypad_button_0).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_1).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_2).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_3).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_4).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_5).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_6).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_7).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_8).setOnClickListener(axlf);
        findViewById(C0126R.C0129id.keypad_button_9).setOnClickListener(axlf);
        ((ImageButton) findViewById(C0126R.C0129id.keypad_button_back)).setOnClickListener(new axlg(this));
        Button button = (Button) findViewById(C0126R.C0129id.keypad_button_decimal);
        button.setText(Character.toString(DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator()));
        button.setOnClickListener(new axlh(this));
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue("com.google.android.gms.walletp2p.feature.widgets.keypadview.KeyPadView", "walletp2p_keypad_period_enabled", true);
        button.setEnabled(attributeBooleanValue);
        if (!attributeBooleanValue) {
            i = 4;
        } else {
            i = 0;
        }
        button.setVisibility(i);
        if (attributeSet.getAttributeBooleanValue("com.google.android.gms.walletp2p.feature.widgets.keypadview.KeyPadView", "walletp2p_keypad_secure_mode", false)) {
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (!audioManager.isWiredHeadsetOn() && !audioManager.isBluetoothA2dpOn() && Settings.Secure.getInt(getContext().getContentResolver(), "speak_password", 0) == 0) {
                findViewById(C0126R.C0129id.keypad_button_0).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_1).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_2).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_3).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_4).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_5).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_6).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_7).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_8).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                findViewById(C0126R.C0129id.keypad_button_9).setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
            }
        }
    }
}
