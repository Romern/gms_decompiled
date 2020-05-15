package p000;

/* renamed from: abvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvp {

    /* renamed from: a */
    private static final bnhe f58559a;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("Action", bqbf.ACTION);
        h.mo67695b("AggregateRating", bqbf.AGGREGATE_RATING);
        h.mo67695b("AlarmInstance", bqbf.ALARM_INSTANCE);
        h.mo67695b("Alarm", bqbf.ALARM);
        h.mo67695b("Attendee", bqbf.ATTENDEE);
        h.mo67695b("Audiobook", bqbf.AUDIOBOOK);
        h.mo67695b("Book", bqbf.BOOK);
        h.mo67695b("ContactPoint", bqbf.CONTACT_POINT);
        h.mo67695b("Contact", bqbf.CONTACT);
        h.mo67695b("ContextualEvent", bqbf.CONTEXTUAL_EVENT);
        h.mo67695b("Conversation", bqbf.CONVERSATION);
        h.mo67695b("Date", bqbf.DATE);
        h.mo67695b("DateTime", bqbf.DATE_TIME);
        h.mo67695b("DigitalDocumentPermission", bqbf.DIGITAL_DOCUMENT_PERMISSION);
        h.mo67695b("DigitalDocument", bqbf.DIGITAL_DOCUMENT);
        h.mo67695b("EmailMessage", bqbf.EMAIL_MESSAGE);
        h.mo67695b("Event", bqbf.EVENT);
        h.mo67695b("ExtractedEntity", bqbf.EXTRACTED_ENTITY);
        h.mo67695b("Flight", bqbf.FLIGHT);
        h.mo67695b("GeoShape", bqbf.GEO_SHAPE);
        h.mo67695b("GmmVoiceModel", bqbf.GMM_VOICE_MODEL);
        h.mo67695b("LocalBusiness", bqbf.LOCAL_BUSINESS);
        h.mo67695b("Message", bqbf.MESSAGE);
        h.mo67695b("MobileApplication", bqbf.MOBILE_APPLICATION);
        h.mo67695b("Movie", bqbf.MOVIE);
        h.mo67695b("MusicAlbum", bqbf.MUSIC_ALBUM);
        h.mo67695b("MusicGroup", bqbf.MUSIC_GROUP);
        h.mo67695b("MusicPlaylist", bqbf.MUSIC_PLAYLIST);
        h.mo67695b("MusicRecording", bqbf.MUSIC_RECORDING);
        h.mo67695b("NoteDigitalDocument", bqbf.NOTE_DIGITAL_DOCUMENT);
        h.mo67695b("Person", bqbf.PERSON);
        h.mo67695b("Photograph", bqbf.PHOTOGRAPH);
        h.mo67695b("Place", bqbf.PLACE);
        h.mo67695b("PostalAddress", bqbf.POSTAL_ADDRESS);
        h.mo67695b("PresentationDigitalDocument", bqbf.PRESENTATION_DIGITAL_DOCUMENT);
        h.mo67695b("Reservation", bqbf.RESERVATION);
        h.mo67695b("Restaurant", bqbf.RESTAURANT);
        h.mo67695b("SpreadsheetDigitalDocument", bqbf.SPREADSHEET_DIGITAL_DOCUMENT);
        h.mo67695b("StashRecord", bqbf.STASH_RECORD);
        h.mo67695b("StickerPack", bqbf.STICKER_PACK);
        h.mo67695b("Sticker", bqbf.STICKER);
        h.mo67695b("StopwatchLap", bqbf.STOPWATCH_LAP);
        h.mo67695b("Stopwatch", bqbf.STOPWATCH);
        h.mo67695b("TextDigitalDocument", bqbf.TEXT_DIGITAL_DOCUMENT);
        h.mo67695b("Thing", bqbf.THING);
        h.mo67695b("Timer", bqbf.TIMER);
        h.mo67695b("TVSeries", bqbf.TV_SERIES);
        h.mo67695b("VideoObject", bqbf.VIDEO_OBJECT);
        h.mo67695b("WebPage", bqbf.WEB_PAGE);
        f58559a = h.mo67618b();
    }

    /* renamed from: a */
    public static bqbf m48355a(String str, abxt abxt) {
        if (str == null) {
            return bqbf.UNKNOWN;
        }
        bqbf bqbf = (bqbf) f58559a.get(str);
        if (bqbf == null) {
            return (abxt.mo32424a(str) || abxt.f58702b.contains(str)) ? bqbf.CONFIG_OVERRIDE : bqbf.UNKNOWN;
        }
        return bqbf;
    }
}
