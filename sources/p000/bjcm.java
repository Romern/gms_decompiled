package p000;

import android.util.Base64;
import com.google.android.ulr.ApiPlaceReportPayload;
import com.google.android.ulr.GmmPlaceReportPayload;
import com.google.android.ulr.GmmPlaceReportPayloadNotificationDetails;
import com.google.android.ulr.GmmPlaceReportPayloadNotificationInfo;
import com.google.android.ulr.GmmPlaceReportPayloadSnapToPlaceRequest;
import com.google.android.ulr.GmmPlaceReportPayloadSnapToPlaceResult;
import com.google.android.ulr.WalletPlaceReportPayload;
import com.google.android.ulr.WalletPlaceReportPayloadInstoreTransactionDetails;
import com.google.android.ulr.WalletPlaceReportPayloadPlaceIdLikelihood;
import com.google.android.ulr.WalletUserEventId;
import java.util.ArrayList;

/* renamed from: bjcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcm {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0302, code lost:
        if (r0.equals("directionsStartPage") != false) goto L_0x0328;
     */
    /* renamed from: a */
    public static bvwx m103196a(ApiPlaceReportPayload apiPlaceReportPayload) {
        bvyv bvyv;
        bvys bvys;
        bvyw bvyw;
        char c;
        bvuz bvuz;
        bvuv bvuv;
        bvuw bvuw;
        String str;
        char c2;
        String str2;
        if (apiPlaceReportPayload == null) {
            return null;
        }
        bxvd da = bvwx.f158029d.mo74144da();
        int i = 1;
        if (apiPlaceReportPayload.getGmmPlaceReportPayload() != null) {
            GmmPlaceReportPayload gmmPlaceReportPayload = apiPlaceReportPayload.getGmmPlaceReportPayload();
            if (gmmPlaceReportPayload != null) {
                bxvd da2 = bvuz.f157762j.mo74144da();
                char c3 = 15;
                if (gmmPlaceReportPayload.mo71625e() != null) {
                    String e = gmmPlaceReportPayload.mo71625e();
                    switch (e.hashCode()) {
                        case -2035376383:
                            if (e.equals("PLACE_SHEET_OTHER_CLICK")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1906603524:
                            if (e.equals("NOT_HERE")) {
                                c2 = 8;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1818645997:
                            if (e.equals("placePickerClick")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1808561682:
                            if (e.equals("hereNotificationDismissed")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1801832945:
                            if (e.equals("PLACE_SHEET_PHOTO_UPLOAD_CLICK")) {
                                c2 = 10;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1354735856:
                            if (e.equals("placeSheetOtherClick")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1343228816:
                            if (e.equals("unknownEvent")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1073479836:
                            if (e.equals("HERE_NOTIFICATION_DISMISSED")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -950812254:
                            if (e.equals("HERE_NOTIFICATION_CLICKED")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -896366576:
                            if (e.equals("PLACE_CLICK")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -292058943:
                            if (e.equals("placeClick")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -236494164:
                            if (e.equals("hereNotificationClicked")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 36600230:
                            if (e.equals("PLACE_SHEET_SAVE_PLACE_CLICK")) {
                                c2 = 12;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 618279126:
                            if (e.equals("placeSheetSavePlaceClick")) {
                                c2 = 13;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 984714029:
                            if (e.equals("placeSheetPhotoUploadClick")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1050898228:
                            if (e.equals("PLACE_PICKER_SUGGEST_CLICK")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1499951481:
                            if (e.equals("placePickerSuggestClick")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1631683279:
                            if (e.equals("PLACE_PICKER_CLICK")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1776143909:
                            if (e.equals("UNKNOWN_EVENT")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2128366947:
                            if (e.equals("notHere")) {
                                c2 = 9;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz2 = (bvuz) da2.f164949b;
                            bvuz2.f157765b = 0;
                            bvuz2.f157764a |= 1;
                            break;
                        case 2:
                        case 3:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz3 = (bvuz) da2.f164949b;
                            bvuz3.f157765b = 2;
                            bvuz3.f157764a |= 1;
                            break;
                        case 4:
                        case 5:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz4 = (bvuz) da2.f164949b;
                            bvuz4.f157765b = 3;
                            bvuz4.f157764a |= 1;
                            break;
                        case 6:
                        case 7:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz5 = (bvuz) da2.f164949b;
                            bvuz5.f157765b = 4;
                            bvuz5.f157764a |= 1;
                            break;
                        case 8:
                        case 9:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz6 = (bvuz) da2.f164949b;
                            bvuz6.f157765b = 1;
                            bvuz6.f157764a |= 1;
                            break;
                        case 10:
                        case 11:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz7 = (bvuz) da2.f164949b;
                            bvuz7.f157765b = 5;
                            bvuz7.f157764a |= 1;
                            break;
                        case 12:
                        case 13:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz8 = (bvuz) da2.f164949b;
                            bvuz8.f157765b = 6;
                            bvuz8.f157764a |= 1;
                            break;
                        case 14:
                        case 15:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz9 = (bvuz) da2.f164949b;
                            bvuz9.f157765b = 7;
                            bvuz9.f157764a |= 1;
                            break;
                        case 16:
                        case 17:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz10 = (bvuz) da2.f164949b;
                            bvuz10.f157765b = 8;
                            bvuz10.f157764a |= 1;
                            break;
                        case 18:
                        case 19:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz11 = (bvuz) da2.f164949b;
                            bvuz11.f157765b = 9;
                            bvuz11.f157764a |= 1;
                            break;
                        default:
                            String valueOf = String.valueOf(gmmPlaceReportPayload.mo71625e());
                            if (valueOf.length() == 0) {
                                str2 = new String("Json2LiteBadEnum userlocation.GmmPlaceReportPayload.user_event ");
                            } else {
                                str2 = "Json2LiteBadEnum userlocation.GmmPlaceReportPayload.user_event ".concat(valueOf);
                            }
                            throw new IllegalArgumentException(str2);
                    }
                }
                if (gmmPlaceReportPayload.mo71626f() != null) {
                    int intValue = gmmPlaceReportPayload.mo71626f().intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvuz bvuz12 = (bvuz) da2.f164949b;
                    bvuz12.f157764a |= 2;
                    bvuz12.f157766c = intValue;
                }
                if (gmmPlaceReportPayload.mo71622b() != null) {
                    String b = gmmPlaceReportPayload.mo71622b();
                    switch (b.hashCode()) {
                        case -2101268368:
                            if (b.equals("HIGH_CONFIDENCE_CLICK")) {
                                c3 = 8;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -2076560469:
                            if (b.equals("guidePage")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1538534651:
                            if (b.equals("PLACE_PAGE_SAVE_CURRENT_LOCATION")) {
                                c3 = 16;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -763658339:
                            break;
                        case -753209043:
                            if (b.equals("BLUE_DOT_CLICK")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -515205961:
                            if (b.equals("DIRECTIONS_START_PAGE")) {
                                c3 = 14;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -194652550:
                            if (b.equals("UNKNOWN_CONTEXT")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -24667643:
                            if (b.equals("unknownContext")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 171963707:
                            if (b.equals("placePageNotHereClick")) {
                                c3 = 11;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 181903132:
                            if (b.equals("highConfidenceClick")) {
                                c3 = 9;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 580074002:
                            if (b.equals("GUIDE_PAGE")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 723670740:
                            if (b.equals("PLACE_PICKER_BUTTON_CLICK")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 818142540:
                            if (b.equals("HERE_NOTIFICATION_SHOWN")) {
                                c3 = 12;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 818885846:
                            if (b.equals("hereNotificationShown")) {
                                c3 = 13;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 948293689:
                            if (b.equals("blueDotClick")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1140131261:
                            if (b.equals("PLACE_PAGE_NOT_HERE_CLICK")) {
                                c3 = 10;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1728998849:
                            if (b.equals("placePickerButtonClick")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2003505403:
                            if (b.equals("placePageSaveCurrentLocation")) {
                                c3 = 17;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 1:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz13 = (bvuz) da2.f164949b;
                            bvuz13.f157767d = 0;
                            bvuz13.f157764a |= 4;
                            break;
                        case 2:
                        case 3:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz14 = (bvuz) da2.f164949b;
                            bvuz14.f157767d = 1;
                            bvuz14.f157764a |= 4;
                            break;
                        case 4:
                        case 5:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz15 = (bvuz) da2.f164949b;
                            bvuz15.f157767d = 2;
                            bvuz15.f157764a |= 4;
                            break;
                        case 6:
                        case 7:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz16 = (bvuz) da2.f164949b;
                            bvuz16.f157767d = 3;
                            bvuz16.f157764a |= 4;
                            break;
                        case 8:
                        case 9:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz17 = (bvuz) da2.f164949b;
                            bvuz17.f157767d = 4;
                            bvuz17.f157764a |= 4;
                            break;
                        case 10:
                        case 11:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz18 = (bvuz) da2.f164949b;
                            bvuz18.f157767d = 5;
                            bvuz18.f157764a |= 4;
                            break;
                        case 12:
                        case 13:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz19 = (bvuz) da2.f164949b;
                            bvuz19.f157767d = 6;
                            bvuz19.f157764a |= 4;
                            break;
                        case 14:
                        case 15:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz20 = (bvuz) da2.f164949b;
                            bvuz20.f157767d = 7;
                            bvuz20.f157764a |= 4;
                            break;
                        case 16:
                        case 17:
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz21 = (bvuz) da2.f164949b;
                            bvuz21.f157767d = 8;
                            bvuz21.f157764a |= 4;
                            break;
                        default:
                            String valueOf2 = String.valueOf(gmmPlaceReportPayload.mo71622b());
                            if (valueOf2.length() == 0) {
                                str = new String("Json2LiteBadEnum userlocation.GmmPlaceReportPayload.context ");
                            } else {
                                str = "Json2LiteBadEnum userlocation.GmmPlaceReportPayload.context ".concat(valueOf2);
                            }
                            throw new IllegalArgumentException(str);
                    }
                }
                if (gmmPlaceReportPayload.getSnapToPlaceRequest() != null) {
                    GmmPlaceReportPayloadSnapToPlaceRequest snapToPlaceRequest = gmmPlaceReportPayload.getSnapToPlaceRequest();
                    if (snapToPlaceRequest != null) {
                        bxvd da3 = bvuw.f157752c.mo74144da();
                        if (snapToPlaceRequest.getQueryLocation() != null) {
                            byex a = bjct.m103203a(snapToPlaceRequest.getQueryLocation());
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bvuw bvuw2 = (bvuw) da3.f164949b;
                            a.getClass();
                            bvuw2.f157755b = a;
                            bvuw2.f157754a |= 1;
                        }
                        bvuw = (bvuw) da3.mo74062i();
                    } else {
                        bvuw = null;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvuz bvuz22 = (bvuz) da2.f164949b;
                    bvuw.getClass();
                    bvuz22.f157768e = bvuw;
                    bvuz22.f157764a |= 8;
                }
                if (gmmPlaceReportPayload.mo71623c() != null) {
                    String c4 = gmmPlaceReportPayload.mo71623c();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvuz bvuz23 = (bvuz) da2.f164949b;
                    c4.getClass();
                    bvuz23.f157764a |= 16;
                    bvuz23.f157769f = c4;
                }
                if (gmmPlaceReportPayload.getSnapToPlaceResults() != null) {
                    ArrayList snapToPlaceResults = gmmPlaceReportPayload.getSnapToPlaceResults();
                    int size = snapToPlaceResults.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        GmmPlaceReportPayloadSnapToPlaceResult gmmPlaceReportPayloadSnapToPlaceResult = (GmmPlaceReportPayloadSnapToPlaceResult) snapToPlaceResults.get(i2);
                        if (gmmPlaceReportPayloadSnapToPlaceResult != null) {
                            bxvd da4 = bvux.f157756d.mo74144da();
                            if (gmmPlaceReportPayloadSnapToPlaceResult.getFeatureId() != null) {
                                byel a2 = bjcp.m103199a(gmmPlaceReportPayloadSnapToPlaceResult.getFeatureId());
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bvux bvux = (bvux) da4.f164949b;
                                a2.getClass();
                                bvux.f157759b = a2;
                                bvux.f157758a |= 1;
                            }
                            if (gmmPlaceReportPayloadSnapToPlaceResult.mo71636b() != null) {
                                int intValue2 = gmmPlaceReportPayloadSnapToPlaceResult.mo71636b().intValue();
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bvux bvux2 = (bvux) da4.f164949b;
                                bvux2.f157758a |= 2;
                                bvux2.f157760c = intValue2;
                            }
                            bvux bvux3 = (bvux) da4.mo74062i();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bvuz bvuz24 = (bvuz) da2.f164949b;
                            bvux3.getClass();
                            if (!bvuz24.f157770g.mo73666a()) {
                                bvuz24.f157770g = bxvk.m124021a(bvuz24.f157770g);
                            }
                            bvuz24.f157770g.add(bvux3);
                        }
                    }
                }
                if (gmmPlaceReportPayload.getNotificationInfo() != null) {
                    GmmPlaceReportPayloadNotificationInfo notificationInfo = gmmPlaceReportPayload.getNotificationInfo();
                    if (notificationInfo != null) {
                        bxvd da5 = bvuv.f157747d.mo74144da();
                        if (notificationInfo.getLocation() != null) {
                            byex a3 = bjct.m103203a(notificationInfo.getLocation());
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bvuv bvuv2 = (bvuv) da5.f164949b;
                            a3.getClass();
                            bvuv2.f157750b = a3;
                            bvuv2.f157749a |= 1;
                        }
                        if (notificationInfo.getNotificationDetails() != null) {
                            ArrayList notificationDetails = notificationInfo.getNotificationDetails();
                            int size2 = notificationDetails.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                GmmPlaceReportPayloadNotificationDetails gmmPlaceReportPayloadNotificationDetails = (GmmPlaceReportPayloadNotificationDetails) notificationDetails.get(i3);
                                if (gmmPlaceReportPayloadNotificationDetails != null) {
                                    bxvd da6 = bvuu.f157741e.mo74144da();
                                    if (gmmPlaceReportPayloadNotificationDetails.getFeatureId() != null) {
                                        byel a4 = bjcp.m103199a(gmmPlaceReportPayloadNotificationDetails.getFeatureId());
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bvuu bvuu = (bvuu) da6.f164949b;
                                        a4.getClass();
                                        bvuu.f157744b = a4;
                                        bvuu.f157743a |= i;
                                    }
                                    if (gmmPlaceReportPayloadNotificationDetails.mo71631c() != null) {
                                        ArrayList c5 = gmmPlaceReportPayloadNotificationDetails.mo71631c();
                                        int size3 = c5.size();
                                        for (int i4 = 0; i4 < size3; i4++) {
                                            String str3 = (String) c5.get(i4);
                                            if (str3 != null) {
                                                if (da6.f164950c) {
                                                    da6.mo74035c();
                                                    da6.f164950c = false;
                                                }
                                                bvuu bvuu2 = (bvuu) da6.f164949b;
                                                str3.getClass();
                                                if (!bvuu2.f157745c.mo73666a()) {
                                                    bvuu2.f157745c = bxvk.m124021a(bvuu2.f157745c);
                                                }
                                                bvuu2.f157745c.add(str3);
                                            }
                                        }
                                    }
                                    if (gmmPlaceReportPayloadNotificationDetails.mo71630b() != null) {
                                        String b2 = gmmPlaceReportPayloadNotificationDetails.mo71630b();
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bvuu bvuu3 = (bvuu) da6.f164949b;
                                        b2.getClass();
                                        bvuu3.f157743a |= 2;
                                        bvuu3.f157746d = b2;
                                    }
                                    bvuu bvuu4 = (bvuu) da6.mo74062i();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvuv bvuv3 = (bvuv) da5.f164949b;
                                    bvuu4.getClass();
                                    if (!bvuv3.f157751c.mo73666a()) {
                                        bvuv3.f157751c = bxvk.m124021a(bvuv3.f157751c);
                                    }
                                    bvuv3.f157751c.add(bvuu4);
                                }
                                i3++;
                                i = 1;
                            }
                        }
                        bvuv = (bvuv) da5.mo74062i();
                    } else {
                        bvuv = null;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvuz bvuz25 = (bvuz) da2.f164949b;
                    bvuv.getClass();
                    bvuz25.f157771h = bvuv;
                    bvuz25.f157764a |= 32;
                }
                if (gmmPlaceReportPayload.mo71624d() != null) {
                    try {
                        bxtx a5 = bxtx.m123261a(Base64.decode(gmmPlaceReportPayload.mo71624d(), 10));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvuz bvuz26 = (bvuz) da2.f164949b;
                        a5.getClass();
                        bvuz26.f157764a |= 64;
                        bvuz26.f157772i = a5;
                    } catch (IllegalArgumentException e2) {
                        throw new IllegalArgumentException("Json2LiteBadBase64 userlocation.GmmPlaceReportPayload.experiment_info", e2);
                    }
                }
                bvuz = (bvuz) da2.mo74062i();
            } else {
                bvuz = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwx bvwx = (bvwx) da.f164949b;
            bvuz.getClass();
            bvwx.f158032b = bvuz;
            bvwx.f158031a |= 1;
        }
        if (apiPlaceReportPayload.getWalletPlaceReportPayload() != null) {
            WalletPlaceReportPayload walletPlaceReportPayload = apiPlaceReportPayload.getWalletPlaceReportPayload();
            if (walletPlaceReportPayload != null) {
                bxvd da7 = bvyv.f158228f.mo74144da();
                if (walletPlaceReportPayload.mo71723b() != null) {
                    String b3 = walletPlaceReportPayload.mo71723b();
                    switch (b3.hashCode()) {
                        case -1932830611:
                            if (b3.equals("instoreTransactionNotification")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1720327473:
                            if (b3.equals("NFC_TAP")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1305665556:
                            if (b3.equals("unknownWalletUserEvent")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1048528392:
                            if (b3.equals("nfcTap")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -564776905:
                            if (b3.equals("UNKNOWN_WALLET_USER_EVENT")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -225423121:
                            if (b3.equals("INSTORE_TRANSACTION_NOTIFICATION")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0 || c == 1) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvyv bvyv2 = (bvyv) da7.f164949b;
                        bvyv2.f158231b = 0;
                        bvyv2.f158230a |= 1;
                    } else if (c == 2 || c == 3) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvyv bvyv3 = (bvyv) da7.f164949b;
                        bvyv3.f158231b = 1;
                        bvyv3.f158230a |= 1;
                    } else if (c == 4 || c == 5) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvyv bvyv4 = (bvyv) da7.f164949b;
                        bvyv4.f158231b = 2;
                        bvyv4.f158230a |= 1;
                    } else {
                        String valueOf3 = String.valueOf(walletPlaceReportPayload.mo71723b());
                        throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Json2LiteBadEnum userlocation.WalletPlaceReportPayload.user_event ") : "Json2LiteBadEnum userlocation.WalletPlaceReportPayload.user_event ".concat(valueOf3));
                    }
                }
                if (walletPlaceReportPayload.getEventId() != null) {
                    WalletUserEventId eventId = walletPlaceReportPayload.getEventId();
                    if (eventId != null) {
                        bxvd da8 = bvyw.f158235c.mo74144da();
                        if (eventId.mo71730b() != null) {
                            String b4 = eventId.mo71730b();
                            if (da8.f164950c) {
                                da8.mo74035c();
                                da8.f164950c = false;
                            }
                            bvyw bvyw2 = (bvyw) da8.f164949b;
                            b4.getClass();
                            bvyw2.f158237a |= 1;
                            bvyw2.f158238b = b4;
                        }
                        bvyw = (bvyw) da8.mo74062i();
                    } else {
                        bvyw = null;
                    }
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bvyv bvyv5 = (bvyv) da7.f164949b;
                    bvyw.getClass();
                    bvyv5.f158232c = bvyw;
                    bvyv5.f158230a |= 2;
                }
                if (walletPlaceReportPayload.getInstoreTransactionDetails() != null) {
                    WalletPlaceReportPayloadInstoreTransactionDetails instoreTransactionDetails = walletPlaceReportPayload.getInstoreTransactionDetails();
                    if (instoreTransactionDetails != null) {
                        bxvd da9 = bvys.f158218c.mo74144da();
                        if (instoreTransactionDetails.mo71727b() != null) {
                            long longValue = instoreTransactionDetails.mo71727b().longValue();
                            if (da9.f164950c) {
                                da9.mo74035c();
                                da9.f164950c = false;
                            }
                            bvys bvys2 = (bvys) da9.f164949b;
                            bvys2.f158220a |= 1;
                            bvys2.f158221b = longValue;
                        }
                        bvys = (bvys) da9.mo74062i();
                    } else {
                        bvys = null;
                    }
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bvyv bvyv6 = (bvyv) da7.f164949b;
                    bvys.getClass();
                    bvyv6.f158233d = bvys;
                    bvyv6.f158230a |= 4;
                }
                if (walletPlaceReportPayload.getPlaceLikelihoodBuffers() != null) {
                    ArrayList placeLikelihoodBuffers = walletPlaceReportPayload.getPlaceLikelihoodBuffers();
                    int size4 = placeLikelihoodBuffers.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        WalletPlaceReportPayloadPlaceIdLikelihood walletPlaceReportPayloadPlaceIdLikelihood = (WalletPlaceReportPayloadPlaceIdLikelihood) placeLikelihoodBuffers.get(i5);
                        if (walletPlaceReportPayloadPlaceIdLikelihood != null) {
                            bxvd da10 = bvyt.f158222d.mo74144da();
                            if (walletPlaceReportPayloadPlaceIdLikelihood.mo71729c() != null) {
                                String c6 = walletPlaceReportPayloadPlaceIdLikelihood.mo71729c();
                                if (da10.f164950c) {
                                    da10.mo74035c();
                                    da10.f164950c = false;
                                }
                                bvyt bvyt = (bvyt) da10.f164949b;
                                c6.getClass();
                                bvyt.f158224a |= 1;
                                bvyt.f158225b = c6;
                            }
                            if (walletPlaceReportPayloadPlaceIdLikelihood.mo71728b() != null) {
                                float floatValue = walletPlaceReportPayloadPlaceIdLikelihood.mo71728b().floatValue();
                                if (da10.f164950c) {
                                    da10.mo74035c();
                                    da10.f164950c = false;
                                }
                                bvyt bvyt2 = (bvyt) da10.f164949b;
                                bvyt2.f158224a |= 2;
                                bvyt2.f158226c = floatValue;
                            }
                            bvyt bvyt3 = (bvyt) da10.mo74062i();
                            if (da7.f164950c) {
                                da7.mo74035c();
                                da7.f164950c = false;
                            }
                            bvyv bvyv7 = (bvyv) da7.f164949b;
                            bvyt3.getClass();
                            if (!bvyv7.f158234e.mo73666a()) {
                                bvyv7.f158234e = bxvk.m124021a(bvyv7.f158234e);
                            }
                            bvyv7.f158234e.add(bvyt3);
                        }
                    }
                }
                bvyv = (bvyv) da7.mo74062i();
            } else {
                bvyv = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwx bvwx2 = (bvwx) da.f164949b;
            bvyv.getClass();
            bvwx2.f158033c = bvyv;
            bvwx2.f158031a |= 2;
        }
        return (bvwx) da.mo74062i();
    }
}
