package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bcwf */
public final /* synthetic */ class bcwf implements bmxj {
    public final Object apply(Object obj) {
        String str;
        char c;
        cbmf cbmf;
        bzst bzst = (bzst) obj;
        if (bzst.mo74577a()) {
            bzss bzss = bzst.f171295a;
            if (bzss.f171294a != bzsr.CANCELED) {
                throw bcwg.m90142a("Unknown", "Media upload failed (hasTransferException)", !bzss.mo74576a() ? chuv.f189217d : chuv.f189229p, bzss);
            }
            throw bcwg.m90141a("Unknown", "Media upload canceled (hasTransferException)", chuv.f189216c);
        } else if (bzst.mo74578b()) {
            bzsb bzsb = bzst.f171296b;
            int i = bzsb.f171220a;
            bzsa bzsa = bzsb.f171221b;
            if (bzsa == null || !bzsa.mo74560a("x-guploader-uploadid")) {
                str = "Unknown";
            } else {
                str = bzsa.mo74563c("x-guploader-uploadid");
                String valueOf = String.valueOf(str);
                bbos.m88289a("ScottyStub", valueOf.length() == 0 ? new String("Media Upload requestId=") : "Media Upload requestId=".concat(valueOf));
            }
            if (i != 200) {
                if (i == 401) {
                    throw bcwg.m90141a(str, "Media upload unauthenticated (Response Code 401)", chuv.f189223j);
                } else if (i != 413) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Media upload failed: responseCode=");
                    sb.append(i);
                    throw bcwg.m90141a(str, sb.toString(), chuv.f189229p);
                } else {
                    throw bcwg.m90141a(str, "Media upload rejected by server because it was too large! (Response Code 413)", chuv.f189218e);
                }
            } else if (bzsa != null) {
                InputStream inputStream = bzsb.f171222c;
                if (inputStream != null) {
                    String c2 = bzsa.mo74563c("X-Goog-Upload-Status");
                    if (c2.hashCode() == 97436022 && c2.equals("final")) {
                        c = 0;
                    } else {
                        c = 65535;
                    }
                    if (c != 0) {
                        String valueOf2 = String.valueOf(c2);
                        throw bcwg.m90141a(str, valueOf2.length() == 0 ? new String("Media upload failed: scottyStatus=") : "Media upload failed: scottyStatus=".concat(valueOf2), chuv.f189229p);
                    }
                    try {
                        cbnc cbnc = (cbnc) bxvk.m124014a(cbnc.f177716b, boav.m111020a(inputStream));
                        if (cbnc != null && (cbmf = cbnc.f177718a) != null && !cbmf.f177613a.isEmpty()) {
                            return cbnc;
                        }
                        throw bcwg.m90141a("Unknown", "Media upload failed: mediaId not found in response", chuv.f189229p);
                    } catch (IOException e) {
                        throw bcwg.m90142a(str, "Error parsing response body", chuv.f189229p, e);
                    }
                } else {
                    throw bcwg.m90141a(str, "Media upload failed: responseBodyStream null", chuv.f189229p);
                }
            } else {
                throw bcwg.m90141a(str, "Media upload failed: responseBodyHeaders null", chuv.f189229p);
            }
        } else {
            throw bcwg.m90141a("Unknown", "Media upload failed: no response", chuv.f189229p);
        }
    }
}
