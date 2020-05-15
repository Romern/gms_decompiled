package com.google.android.gms.googlehelp.contact.chat;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChatConversationTranscriptLayoutAdapter$1$1 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ aavw f78890a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatConversationTranscriptLayoutAdapter$1$1(aavw aavw, String str) {
        super(str);
        this.f78890a = aavw;
    }

    public void onClick(View view) {
        abcx.m47503b(this.f78890a.f56676d.f56701n, 75, bzps.CHAT);
        super.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
    }
}
