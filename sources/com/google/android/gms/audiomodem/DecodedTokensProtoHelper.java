package com.google.android.gms.audiomodem;

import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DecodedTokensProtoHelper {
    private final List tokens = new ArrayList();

    /* access modifiers changed from: package-private */
    public void addToken(byte[] bArr) {
        this.tokens.add(bArr);
    }

    public bzwp build() {
        bxvd da = bzwp.f171662b.mo74144da();
        for (int i = 0; i < this.tokens.size(); i++) {
            bxvd da2 = bzwo.f171658c.mo74144da();
            bxtx a = bxtx.m123261a((byte[]) this.tokens.get(i));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzwo bzwo = (bzwo) da2.f164949b;
            a.getClass();
            bzwo.f171660a |= 1;
            bzwo.f171661b = a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzwp bzwp = (bzwp) da.f164949b;
            bzwo bzwo2 = (bzwo) da2.mo74062i();
            bzwo2.getClass();
            if (!bzwp.f171664a.mo73666a()) {
                bzwp.f171664a = GeneratedMessageLite.m124021a(bzwp.f171664a);
            }
            bzwp.f171664a.add(bzwo2);
        }
        return (bzwp) da.mo74062i();
    }
}
