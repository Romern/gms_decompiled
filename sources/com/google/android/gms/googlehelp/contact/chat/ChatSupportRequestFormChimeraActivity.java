package com.google.android.gms.googlehelp.contact.chat;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChatSupportRequestFormChimeraActivity extends abbi {

    /* renamed from: b */
    private EditText f78921b;

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean a = aayi.m47267a();
        int i = C0126R.style.gh_ChatRequestFormDarkActivityStyle;
        if (a) {
            aayi.m47266a(this, this.f56986y, (int) C0126R.style.gh_ChatRequestFormLightActivityStyle, (int) C0126R.style.gh_ChatRequestFormDarkActivityStyle, (int) C0126R.style.gh_ChatRequestFormDayNightActivityStyle);
        } else {
            if (!aayi.m47269a(this.f56986y)) {
                i = C0126R.style.gh_ChatRequestFormLightActivityStyle;
            }
            setTheme(i);
        }
        aarq.m46801a(this, true);
        if (!aaya.m47228a(cefe.m136708b())) {
            aatj.m46985a(this);
        } else {
            setRequestedOrientation(1);
        }
        String string = getString(C0126R.string.gh_chat_request_form_activity_title);
        setTitle(string);
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15845a(string);
        }
        setContentView((int) C0126R.C0128layout.gh_chat_request_form_activity);
        this.f78921b = (EditText) findViewById(C0126R.C0129id.gh_chat_request_form_issue_description);
        TextView textView = (TextView) findViewById(C0126R.C0129id.gh_chat_request_form_account_email);
        Account account = this.f56986y.f78829d;
        if (account == null) {
            Log.e("gH_RTSuptClsfierAcvty", "Account is required for chat support.");
            finish();
            return;
        }
        textView.setText(String.format("%s: %s", getString(C0126R.string.gh_request_as), account.name));
        aatj.m46983a((TextView) findViewById(C0126R.C0129id.gh_application_info_and_privacy_policy), this, bzps.CHAT);
        getWindow().setSoftInputMode(34);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.gh_chat_support_request_form_activity_menu, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.gh_chat_support_request_form_submit);
        findItem.setIcon(aayh.m47232a(this, aayi.m47270b() ? aayi.m47263a(this, C0126R.attr.gh_primaryBlueColor) : C1133kh.m17843b(this, C0126R.color.google_blue600)));
        new aavd(bngx.m109356a(this.f78921b), findItem).mo31820a();
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
     arg types: [com.google.android.gms.googlehelp.contact.chat.ChatSupportRequestFormChimeraActivity, com.google.android.gms.googlehelp.common.HelpConfig, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(long, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(abdx, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, boolean, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.gh_chat_support_request_form_submit) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpConfig helpConfig = this.f56986y;
        helpConfig.f78850y = this.f78921b.getText().toString();
        aawg.m47121h(this, helpConfig);
        ChatRequestAndConversationChimeraService.m66447a((Context) this, helpConfig, true);
        startActivity(ChatConversationChimeraActivity.m66400a(this, this.f56986y));
        abcx.m47469a(this, 21, bzps.CHAT);
        finish();
        return true;
    }
}
