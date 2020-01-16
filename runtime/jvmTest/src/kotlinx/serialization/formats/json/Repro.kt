package kotlinx.serialization.formats.json

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import org.junit.Test

class Repro {
    @Serializable
    data class Video(
        @SerialName("annotations")
        val annotations: List<Annotation> = listOf(),
        @SerialName("attestation")
        val attestation: Attestation? = null,
        @SerialName("captions")
        val captions: Captions? = null,
        @SerialName("microformat")
        val microformat: Microformat? = null,
        @SerialName("playabilityStatus")
        val playabilityStatus: PlayabilityStatus? = null,
        @SerialName("playbackTracking")
        val playbackTracking: PlaybackTracking? = null,
        @SerialName("playerConfig")
        val playerConfig: PlayerConfig? = null,
        @SerialName("storyboards")
        val storyboards: Storyboards? = null,
        @SerialName("streamingData")
        val streamingData: StreamingData? = null,
        @SerialName("trackingParams")
        val trackingParams: String = "",
        @SerialName("videoDetails")
        val videoDetails: VideoDetails? = null
    )

    @Serializable
    data class Annotation(
        @SerialName("playerAnnotationsUrlsRenderer")
        val playerAnnotationsUrlsRenderer: PlayerAnnotationsUrlsRenderer? = null
    )

    @Serializable
    data class PlayerAnnotationsUrlsRenderer(
        @SerialName("allowInPlaceSwitch")
        val allowInPlaceSwitch: Boolean = false,
        @SerialName("invideoUrl")
        val invideoUrl: String = "",
        @SerialName("loadPolicy")
        val loadPolicy: String = ""
    )

    @Serializable
    data class Attestation(
        @SerialName("playerAttestationRenderer")
        val playerAttestationRenderer: PlayerAttestationRenderer? = null
    )

    @Serializable
    data class PlayerAttestationRenderer(
        @SerialName("botguardData")
        val botguardData: BotguardData? = null,
        @SerialName("challenge")
        val challenge: String = ""
    )

    @Serializable
    data class BotguardData(
        @SerialName("interpreterUrl")
        val interpreterUrl: String = "",
        @SerialName("program")
        val program: String = ""
    )

    @Serializable
    data class Captions(
        @SerialName("playerCaptionsRenderer")
        val playerCaptionsRenderer: PlayerCaptionsRenderer? = null,
        @SerialName("playerCaptionsTracklistRenderer")
        val playerCaptionsTracklistRenderer: PlayerCaptionsTracklistRenderer? = null
    )

    @Serializable
    data class PlayerCaptionsRenderer(
        @SerialName("baseUrl")
        val baseUrl: String = "",
        @SerialName("visibility")
        val visibility: String = ""
    )

    @Serializable
    data class PlayerCaptionsTracklistRenderer(
        @SerialName("audioTracks")
        val audioTracks: List<AudioTrack> = listOf(),
        @SerialName("captionTracks")
        val captionTracks: List<CaptionTrack> = listOf(),
        @SerialName("defaultAudioTrackIndex")
        val defaultAudioTrackIndex: Int = 0,
        @SerialName("translationLanguages")
        val translationLanguages: List<TranslationLanguage> = listOf()
    )

    @Serializable
    data class AudioTrack(
        @SerialName("captionTrackIndices")
        val captionTrackIndices: List<Int> = listOf(),
        @SerialName("visibility")
        val visibility: String = ""
    )

    @Serializable
    data class CaptionTrack(
        @SerialName("baseUrl")
        val baseUrl: String = "",
        @SerialName("isTranslatable")
        val isTranslatable: Boolean = false,
        @SerialName("kind")
        val kind: String = "",
        @SerialName("languageCode")
        val languageCode: String = "",
        @SerialName("name")
        val name: Name? = null,
        @SerialName("vssId")
        val vssId: String = ""
    )

    @Serializable
    data class Name(
        @SerialName("simpleText")
        val simpleText: String = ""
    )

    @Serializable
    data class TranslationLanguage(
        @SerialName("languageCode")
        val languageCode: String = "",
        @SerialName("languageName")
        val languageName: LanguageName? = null
    )

    @Serializable
    data class LanguageName(
        @SerialName("simpleText")
        val simpleText: String = ""
    )

    @Serializable
    data class Microformat(
        @SerialName("playerMicroformatRenderer")
        val playerMicroformatRenderer: PlayerMicroformatRenderer? = null
    )

    @Serializable
    data class PlayerMicroformatRenderer(
        @SerialName("availableCountries")
        val availableCountries: List<String> = listOf(),
        @SerialName("category")
        val category: String = "",
        @SerialName("description")
        val description: Description? = null,
        @SerialName("embed")
        val embed: Embed? = null,
        @SerialName("externalChannelId")
        val externalChannelId: String = "",
        @SerialName("hasYpcMetadata")
        val hasYpcMetadata: Boolean = false,
        @SerialName("isUnlisted")
        val isUnlisted: Boolean = false,
        @SerialName("lengthSeconds")
        val lengthSeconds: String = "",
        @SerialName("ownerChannelName")
        val ownerChannelName: String = "",
        @SerialName("ownerGplusProfileUrl")
        val ownerGplusProfileUrl: String = "",
        @SerialName("ownerProfileUrl")
        val ownerProfileUrl: String = "",
        @SerialName("publishDate")
        val publishDate: String = "",
        @SerialName("thumbnail")
        val thumbnail: Thumbnail? = null,
        @SerialName("title")
        val title: Title? = null,
        @SerialName("uploadDate")
        val uploadDate: String = "",
        @SerialName("viewCount")
        val viewCount: String = ""
    )

    @Serializable
    data class Description(
        @SerialName("simpleText")
        val simpleText: String = ""
    )

    @Serializable
    data class Embed(
        @SerialName("flashSecureUrl")
        val flashSecureUrl: String = "",
        @SerialName("flashUrl")
        val flashUrl: String = "",
        @SerialName("height")
        val height: Int = 0,
        @SerialName("iframeUrl")
        val iframeUrl: String = "",
        @SerialName("width")
        val width: Int = 0
    )

    @Serializable
    data class Thumbnail(
        @SerialName("thumbnails")
        val thumbnails: List<ThumbnailX> = listOf()
    )

    @Serializable
    data class ThumbnailX(
        @SerialName("height")
        val height: Int = 0,
        @SerialName("url")
        val url: String = "",
        @SerialName("width")
        val width: Int = 0
    )

    @Serializable
    data class Title(
        @SerialName("simpleText")
        val simpleText: String = ""
    )

    @Serializable
    data class PlayabilityStatus(
        @SerialName("playableInEmbed")
        val playableInEmbed: Boolean = false,
        @SerialName("status")
        val status: String = ""
    )

    @Serializable
    data class PlaybackTracking(
        @SerialName("atrUrl")
        val atrUrl: AtrUrl? = null,
        @SerialName("ptrackingUrl")
        val ptrackingUrl: PtrackingUrl? = null,
        @SerialName("qoeUrl")
        val qoeUrl: QoeUrl? = null,
        @SerialName("setAwesomeUrl")
        val setAwesomeUrl: SetAwesomeUrl? = null,
        @SerialName("videostatsDelayplayUrl")
        val videostatsDelayplayUrl: VideostatsDelayplayUrl? = null,
        @SerialName("videostatsPlaybackUrl")
        val videostatsPlaybackUrl: VideostatsPlaybackUrl? = null,
        @SerialName("videostatsWatchtimeUrl")
        val videostatsWatchtimeUrl: VideostatsWatchtimeUrl? = null
    )

    @Serializable
    data class AtrUrl(
        @SerialName("baseUrl")
        val baseUrl: String = "",
        @SerialName("elapsedMediaTimeSeconds")
        val elapsedMediaTimeSeconds: Int = 0
    )

    @Serializable
    data class PtrackingUrl(
        @SerialName("baseUrl")
        val baseUrl: String = ""
    )

    @Serializable
    data class QoeUrl(
        @SerialName("baseUrl")
        val baseUrl: String = ""
    )

    @Serializable
    data class SetAwesomeUrl(
        @SerialName("baseUrl")
        val baseUrl: String = "",
        @SerialName("elapsedMediaTimeSeconds")
        val elapsedMediaTimeSeconds: Int = 0
    )

    @Serializable
    data class VideostatsDelayplayUrl(
        @SerialName("baseUrl")
        val baseUrl: String = ""
    )

    @Serializable
    data class VideostatsPlaybackUrl(
        @SerialName("baseUrl")
        val baseUrl: String = ""
    )

    @Serializable
    data class VideostatsWatchtimeUrl(
        @SerialName("baseUrl")
        val baseUrl: String = ""
    )

    @Serializable
    data class PlayerConfig(
        @SerialName("audioConfig")
        val audioConfig: AudioConfig? = null,
        @SerialName("mediaCommonConfig")
        val mediaCommonConfig: MediaCommonConfig? = null,
        @SerialName("streamSelectionConfig")
        val streamSelectionConfig: StreamSelectionConfig? = null
    )

    @Serializable
    data class AudioConfig(
        @SerialName("enablePerFormatLoudness")
        val enablePerFormatLoudness: Boolean = false,
        @SerialName("loudnessDb")
        val loudnessDb: Double = 0.0,
        @SerialName("perceptualLoudnessDb")
        val perceptualLoudnessDb: Double = 0.0
    )

    @Serializable
    data class MediaCommonConfig(
        @SerialName("dynamicReadaheadConfig")
        val dynamicReadaheadConfig: DynamicReadaheadConfig? = null
    )

    @Serializable
    data class DynamicReadaheadConfig(
        @SerialName("maxReadAheadMediaTimeMs")
        val maxReadAheadMediaTimeMs: Int = 0,
        @SerialName("minReadAheadMediaTimeMs")
        val minReadAheadMediaTimeMs: Int = 0,
        @SerialName("readAheadGrowthRateMs")
        val readAheadGrowthRateMs: Int = 0
    )

    @Serializable
    data class StreamSelectionConfig(
        @SerialName("maxBitrate")
        val maxBitrate: String = ""
    )

    @Serializable
    data class Storyboards(
        @SerialName("playerStoryboardSpecRenderer")
        val playerStoryboardSpecRenderer: PlayerStoryboardSpecRenderer? = null
    )

    @Serializable
    data class PlayerStoryboardSpecRenderer(
        @SerialName("spec")
        val spec: String = ""
    )

    @Serializable
    data class StreamingData(
        @SerialName("adaptiveFormats")
        val adaptiveFormats: List<AdaptiveFormat> = listOf(),
        @SerialName("expiresInSeconds")
        val expiresInSeconds: String = "",
        @SerialName("formats")
        val formats: List<Format> = listOf()
    )

    @Serializable
    data class AdaptiveFormat(
        @SerialName("approxDurationMs")
        val approxDurationMs: String = "",
        @SerialName("audioChannels")
        val audioChannels: Int = 0,
        @SerialName("audioQuality")
        val audioQuality: String = "",
        @SerialName("audioSampleRate")
        val audioSampleRate: String = "",
        @SerialName("averageBitrate")
        val averageBitrate: Int = 0,
        @SerialName("bitrate")
        val bitrate: Int = 0,
        @SerialName("colorInfo")
        val colorInfo: ColorInfo? = null,
        @SerialName("contentLength")
        val contentLength: String = "",
        @SerialName("fps")
        val fps: Int = 0,
        @SerialName("height")
        val height: Int = 0,
        @SerialName("highReplication")
        val highReplication: Boolean = false,
        @SerialName("indexRange")
        val indexRange: IndexRange? = null,
        @SerialName("initRange")
        val initRange: InitRange? = null,
        @SerialName("itag")
        val itag: Int = 0,
        @SerialName("lastModified")
        val lastModified: String = "",
        @SerialName("mimeType")
        val mimeType: String = "",
        @SerialName("projectionType")
        val projectionType: String = "",
        @SerialName("quality")
        val quality: String = "",
        @SerialName("qualityLabel")
        val qualityLabel: String = "",
        @SerialName("url")
        val url: String = "",
        @SerialName("width")
        val width: Int = 0
    )

    @Serializable
    data class ColorInfo(
        @SerialName("matrixCoefficients")
        val matrixCoefficients: String = "",
        @SerialName("primaries")
        val primaries: String = "",
        @SerialName("transferCharacteristics")
        val transferCharacteristics: String = ""
    )

    @Serializable
    data class IndexRange(
        @SerialName("end")
        val end: String = "",
        @SerialName("start")
        val start: String = ""
    )

    @Serializable
    data class InitRange(
        @SerialName("end")
        val end: String = "",
        @SerialName("start")
        val start: String = ""
    )

    @Serializable
    data class Format(
        @SerialName("approxDurationMs")
        val approxDurationMs: String = "",
        @SerialName("audioChannels")
        val audioChannels: Int = 0,
        @SerialName("audioQuality")
        val audioQuality: String = "",
        @SerialName("audioSampleRate")
        val audioSampleRate: String = "",
        @SerialName("averageBitrate")
        val averageBitrate: Int = 0,
        @SerialName("bitrate")
        val bitrate: Int = 0,
        @SerialName("contentLength")
        val contentLength: String = "",
        @SerialName("height")
        val height: Int = 0,
        @SerialName("itag")
        val itag: Int = 0,
        @SerialName("lastModified")
        val lastModified: String = "",
        @SerialName("mimeType")
        val mimeType: String = "",
        @SerialName("projectionType")
        val projectionType: String = "",
        @SerialName("quality")
        val quality: String = "",
        @SerialName("qualityLabel")
        val qualityLabel: String = "",
        @SerialName("url")
        val url: String = "",
        @SerialName("width")
        val width: Int = 0
    )

    @Serializable
    data class VideoDetails(
        @SerialName("allowRatings")
        val allowRatings: Boolean = false,
        @SerialName("author")
        val author: String = "",
        @SerialName("averageRating")
        val averageRating: Double = 0.0,
        @SerialName("channelId")
        val channelId: String = "",
        @SerialName("isCrawlable")
        val isCrawlable: Boolean = false,
        @SerialName("isLiveContent")
        val isLiveContent: Boolean = false,
        @SerialName("isOwnerViewing")
        val isOwnerViewing: Boolean = false,
        @SerialName("isPrivate")
        val isPrivate: Boolean = false,
        @SerialName("isUnpluggedCorpus")
        val isUnpluggedCorpus: Boolean = false,
        @SerialName("keywords")
        val keywords: List<String> = listOf(),
        @SerialName("lengthSeconds")
        val lengthSeconds: String = "",
        @SerialName("shortDescription")
        val shortDescription: String = "",
        @SerialName("thumbnail")
        val thumbnail: ThumbnailXX? = null,
        @SerialName("title")
        val title: String = "",
        @SerialName("videoId")
        val videoId: String = "",
        @SerialName("viewCount")
        val viewCount: String = ""
    )

    @Serializable
    data class ThumbnailXX(
        @SerialName("thumbnails")
        val thumbnails: List<ThumbnailXXX> = listOf()
    )

    @Serializable
    data class ThumbnailXXX(
        @SerialName("height")
        val height: Int = 0,
        @SerialName("url")
        val url: String = "",
        @SerialName("width")
        val width: Int = 0
    )

    @Test
    fun foo() {
        val input = Repro::class.java.getResourceAsStream("/f.txt").readBytes().decodeToString()
        val json = Json(JsonConfiguration.Stable.copy(strictMode = false, unquoted = true))
        val video = json.parse(Video.serializer(), input)
        println(video)
    }
}
